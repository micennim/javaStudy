package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class numberPad extends JFrame implements ActionListener, KeyListener {
    JFrame jf = new JFrame();
    JPanel numberJp = new JPanel();
    JPanel resultJp = new JPanel();
    JTextField resultTf;
    JButton[] numberBt = new JButton[24];
    String resultStr = "";
    int a = 0;
    int b = 0;
    int c = 0;
    int result = 0;

    public numberPad() {
        ArrayList<String> numberString = new ArrayList<String>(Arrays.asList("%", "CE", "C", "<-", "1/X", "x^2", "ds", "÷", "7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "="));
        int count = 0;
        resultTf = new JTextField("");
        resultTf.setFont(new Font("맑은 고딕", Font.BOLD, 50));
        resultTf.setHorizontalAlignment(JTextField.RIGHT);
        for (String str : numberString) {
            numberBt[count] = new JButton(str);
            numberBt[count].setFont(new Font("맑은 고딕", Font.BOLD, 30));
            numberJp.add(numberBt[count]);
            numberBt[count].addActionListener(this);
            numberBt[count].addKeyListener(this);
            count++;
        }
        numberJp.setLayout(new GridLayout(6, 4));
        numberJp.setPreferredSize(new Dimension(500, 600));

        resultJp.add(resultTf);
        resultJp.setLayout(new GridLayout(0, 1));
        resultJp.setPreferredSize(new Dimension(500, 200));


        jf.add(resultJp, new BorderLayout().NORTH);
        jf.add(numberJp, new BorderLayout().CENTER);
        jf.setSize(500, 1000);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new numberPad();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < numberBt.length; i++) {
            try {
                if(e.getSource()==numberBt[5]){
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText(jegop(a)+"");
                    resultStr = "";
                    break;
                }if (e.getSource() == numberBt[7]) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 1;
                    resultStr = "";
                    break;
                } else if (e.getSource() == numberBt[11]) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 2;
                    resultStr = "";
                    break;
                } else if (e.getSource() == numberBt[15]) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 3;
                    resultStr = "";
                    break;
                } else if (e.getSource() == numberBt[19]) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 4;
                    resultStr = "";
                    break;
                } else if (e.getSource() == numberBt[23]) {
                    b = Integer.parseInt(resultTf.getText());
                    System.out.println("123");
                    resultStr = "";
                    if (c == 1) {
                        resultTf.setText(nanu(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    } else if (c == 2) {
                        resultTf.setText(gop(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    } else if (c == 3) {
                        resultTf.setText(bbel(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    } else if (c == 4) {
                        resultTf.setText(hap(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    }
                    break;
                } else if (e.getSource() == numberBt[3]) {
                    resultStr = "";
                    resultTf.setText("");
                    break;
                } else if (e.getSource() == numberBt[i]) {
                    resultStr += numberBt[i].getText();
                    resultTf.setText(resultStr);
                    break;
                }
            }catch (NumberFormatException numberFormatException){
                JOptionPane.showMessageDialog(null,"미구현된 기능입니다","ERROR",JOptionPane.WARNING_MESSAGE);
                break;
            }

        }
    }

    public int nanu(int a, int b) {
        return a / b;
    }

    public int gop(int a, int b) {
        return a * b;
    }

    public int hap(int a, int b) {
        return a + b;
    }

    public int bbel(int a, int b) {
        return a - b;
    }
    public int jegop(int a){
        return a*a;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        for (int i = 0; i < numberBt.length; i++) {
            try {
                if (e.getKeyCode() == 111) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 1;
                    resultStr = "";
                    break;
                } else if (e.getKeyCode() == 106) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 2;
                    resultStr = "";
                    break;
                } else if (e.getKeyCode() == 107) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 3;
                    resultStr = "";
                    break;
                } else if (e.getKeyCode() == 109) {
                    a = Integer.parseInt(resultTf.getText());
                    System.out.println(a);
                    resultTf.setText("");
                    c = 4;
                    resultStr = "";
                    break;
                } else if (e.getKeyCode() == 10) {
                    b = Integer.parseInt(resultTf.getText());
                    System.out.println("123");
                    if (c == 1) {
                        resultTf.setText(nanu(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    } else if (c == 2) {
                        resultTf.setText(gop(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    } else if (c == 3) {
                        resultTf.setText(hap(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    } else if (c == 4) {
                        resultTf.setText(bbel(a, b) + "");
                        a = 0;
                        b = 0;
                        c = 5;
                        break;
                    }
                    break;
                } else if (e.getKeyCode() > 47 && e.getKeyCode() < 58) {
                    resultStr += e.getKeyChar();
                    resultTf.setText(resultStr);
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null,"미구현된 기능입니다","ERROR",JOptionPane.WARNING_MESSAGE);
                break;
            }


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
