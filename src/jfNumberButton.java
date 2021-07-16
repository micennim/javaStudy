import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class jfNumberButton extends JFrame implements ActionListener {
    JFrame numberFr = new JFrame();
    JPanel numberPn = new JPanel();
    JPanel resultPn = new JPanel();
    JTextField resultTf;
    JButton[] numberBt = new JButton[24];
    String resultText = "";
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int result = 0;

    public jfNumberButton() {
        ArrayList<String> number = new ArrayList<String>();
        int count = 0;
        resultTf = new JTextField(SwingConstants.RIGHT);
        number.add("%");
        number.add("CE");
        number.add("C");
        number.add("<-");
        number.add("1/x");
        number.add("x^2");
        number.add("ds");
        number.add("÷");
        number.add("7");
        number.add("8");
        number.add("9");
        number.add("X");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("-");
        number.add("1");
        number.add("2");
        number.add("3");
        number.add("+");
        number.add("+/-");
        number.add("0");
        number.add(".");
        number.add("=");
        for (String str : number) {
            numberBt[count] = new JButton(str);
            numberBt[count].setFont(new Font("맑은 고딕", Font.BOLD, 30));
            count++;

        }
        for (int i = 0; i < 24; i++) {
            numberPn.add(numberBt[i]);
            numberBt[i].addActionListener(this);
        }

        BorderLayout bl = new BorderLayout();
        resultTf.setFont(new Font("맑은 고딕", Font.BOLD, 50));
        resultTf.setHorizontalAlignment(JTextField.RIGHT);
        resultPn.setPreferredSize(new Dimension(490, 300));
        resultPn.add(resultTf);
        resultPn.setLayout(new GridLayout(1, 0));
        //resultPn.setSize(490,300);
        numberPn.setPreferredSize(new Dimension(490, 500));
        numberPn.setLayout(new GridLayout(6, 4));
        //numberPn.setSize(490,400);
        numberFr.add(resultPn, bl.NORTH);
        numberFr.add(numberPn, bl.CENTER);
        numberFr.setSize(500, 1000);
        numberFr.setVisible(true);
    }

    public static void main(String[] args) {
        new jfNumberButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 23; i++) {
            if(e.getSource()==numberBt[7]){
                a=Integer.parseInt(resultTf.getText());
                System.out.println(a);
                resultText="";
                c=1;
                resultTf.setText("");
                break;
            }else if(e.getSource()==numberBt[11]){
                a=Integer.parseInt(resultTf.getText());

                resultText="";
                c=2;
                System.out.println(a+""+c);
                resultTf.setText("");
                break;
            }else if(e.getSource()==numberBt[15]){
                a=Integer.parseInt(resultTf.getText());
                resultTf.setText("");
                resultText="";
                c=3;
                System.out.println(a+""+c);

                break;
            }else if(e.getSource()==numberBt[19]){
                a=Integer.parseInt(resultTf.getText());
                resultTf.setText("");
                resultText="";
                c=4;
                break;
            }else if(e.getSource()==numberBt[23]){
                b=Integer.parseInt(resultTf.getText());
                System.out.println("hihihi"+a);
                if(c==1){
                    resultTf.setText(""+nanu(a,b));
                    a=0;
                    b=0;
                    c=5;
                    break;
                }else if(c==2){
                    resultTf.setText(""+gop(a,b));
                    a=0;
                    b=0;
                    c=5;
                    break;
                }else if(c==3){
                    resultTf.setText(""+bbe(a,b));
                    a=0;
                    b=0;
                    c=5;
                    break;
                }else if(c==4){
                    resultTf.setText(""+hap(a,b));
                    a=0;
                    b=0;
                    c=5;
                    break;
                }
                break;

            }
            else if (e.getSource() == numberBt[i]) {
                if(c==5){
                    resultTf.setText("");
                    c=0;
                }
                resultText += numberBt[i].getText();
                resultTf.setText(resultText);
                break;
            }
        }


    }
    public int gop(int fn, int sn){
        return fn*sn;
    }
    public int nanu(int fn, int sn){
        return fn/sn;
    }
    public int hap(int fn, int sn){
        return fn+sn;
    }
    public int bbe(int fn, int sn){
        return fn-sn;
    }

}
