
import javax.swing.*;
import java.awt.*;

public class loginTest extends JFrame {
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    JPanel jip = new JPanel();
    JPanel jpp = new JPanel();
    JPanel jbp = new JPanel();
    JTextField tfi = new JTextField(10);
    JTextField tfp = new JTextField(10);
    JButton jb = new JButton("로그인");
    JButton jb2 = new JButton("회원가입");
    public loginTest() {
        jbp.setLayout(new GridLayout(0,2));
        jp.setLayout(new GridLayout(3,0));

        jip.add(tfi);
        jpp.add(tfp);
        jp.add(jip);
        jp.add(jpp);
        jp.add(jbp);
        jbp.add(jb);
        jbp.add(jb2);
        jf.add(jp);
        jf.setSize(300,200);
        this.setSize(300,200);
        this.setVisible(true);

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("hi");
        new loginTest();

    }

}
