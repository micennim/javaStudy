import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.*;


public class canvasTest {
    private Frame mainFrame;
    private Label headerLabel;
    private Panel controlPanel;
    ImageIcon icon;
    static String scanText = "";
    static String checkText = "";

    public void readJson() {

    }


    public canvasTest() throws IOException, ParseException {
        prepareGUI();
    }

    public static void main(String[] args) throws IOException, ParseException {
        canvasTest ct = new canvasTest();
        ct.readJson();
        ct.showControl();

    }

    private void prepareGUI() {
        mainFrame = new Frame("AWT 샘플");
        mainFrame.setSize(1500, 1000);
        mainFrame.setLayout(new GridLayout(1, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("canvasTesting");

        controlPanel = new Panel();
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }

    private void showControl() {
        controlPanel.setLayout(new GridLayout(1, 1, 0, 0));
        MyCanvas mc = new MyCanvas();
        mc.setPath("/123.png");
        controlPanel.add(mc);
        mainFrame.setVisible(true);
    }

    class MyCanvas extends Canvas {

        String path;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public MyCanvas() {
            setBackground(Color.GRAY);
        }

        public void paint(Graphics g) {

            icon = new ImageIcon(path);
            BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2,g1;
            g1 = (Graphics2D) g;
            g2 = img.createGraphics();
            g2.setColor(Color.white);g1.setColor(Color.white);

            Font font = new Font("Serif", Font.PLAIN, 13);
            g2.drawString("text", 10, 20);
            g2.setFont(font);
            g2.drawImage(icon.getImage(), 0, 0, null);

            g1.drawString("text", 10, 20);
            g1.setFont(font);
            g1.drawImage(icon.getImage(), 0, 0, null);

            g2.setColor(Color.blue);
            g1.setColor(Color.blue);


            try {

                JSONParser parser = new JSONParser();
                // JSON 파일 읽기
                Reader reader = new FileReader("d://canvasTest.json");
                JSONObject obj = (JSONObject) parser.parse(reader);
                JSONArray dataarry = (JSONArray) obj.get("images");
                JSONObject obj2 = (JSONObject) dataarry.get(0);
                JSONArray dataarry2 = (JSONArray) obj2.get("fields");

                long enter = 0;
                long enter2 = 0;

                System.out.println("obj2=" + obj2.toString());
                System.out.println("object : " + String.valueOf(obj) + "\ndata : " + obj.get("version"));
                for (int i = 0; i < dataarry2.size(); i++) {


                    JSONObject obj3 = (JSONObject) dataarry2.get(i);

                    JSONObject boundingPolyObj = (JSONObject) obj3.get("boundingPoly");
                    JSONArray boundingArrayObj = (JSONArray) boundingPolyObj.get("vertices");
                    JSONObject xyStartObject = (JSONObject) boundingArrayObj.get(0);
                    JSONObject xyEndObject = (JSONObject) boundingArrayObj.get(2);
                    double objectStartX = (double) xyStartObject.get("x");
                    double objectStartY = (double) xyStartObject.get("y");
                    double objectEndX = (double) xyEndObject.get("x");
                    double objectEndY = (double) xyEndObject.get("y");
                    g2.draw(new Rectangle((int) objectStartX, (int) objectStartY, (int) (objectEndX - objectStartX), (int) (objectEndY - objectStartY)));
                    g1.draw(new Rectangle((int) objectStartX, (int) objectStartY, (int) (objectEndX - objectStartX), (int) (objectEndY - objectStartY)));
                    scanText += obj3.get("inferText") + " ";
                    checkText += obj3.get("inferText") + " ";


                    /*
                     * double ap = 0; ap = obj3.getDouble("inferConfidence"); if
                     * (obj3.getDouble("inferConfidence") < 0.95) { //
                     * confidence+=obj3.get("inferText")+" : //
                     * "+obj3.getDouble("inferConfidence")*100+"%\n"; //
                     * System.out.println("why.. = " + ap); }
                      lastIndexCf
                     */
                    if ((boolean) obj3.get("lineBreak")) {
                        scanText += "\n";
                        checkText += "\n";
                    }

                }
                System.out.println("scanText = \n------------------------------------------\n" + checkText
                        + "------------------------------------------");
            } catch (Exception e) {
                System.out.println("error : " + e);
            }

            File file = new File("D:/ocrImage/g2Test.png");
            try {
                ImageIO.write(img, "jpg", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
