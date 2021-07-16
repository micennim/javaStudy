package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginTest extends JFrame implements ActionListener {
    JFrame jf ;
    JPanel jp,jp1,jp2,jp3;
    JLabel jli,jlp;
    JButton jb1,jb2;

    JTextField jtf1= new JTextField("안녕하세요를레히이");
    JTextField jtf2= new JTextField("안녕못해요를레히이");

    public loginTest(){
        jf = new JFrame();
        jp = new JPanel();
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jb1 =new JButton("로그인");
        jb2 =new JButton("회원가입");
        jli = new JLabel("ID");
        jlp = new JLabel("PASSWORD");



        jp.setLayout(new GridLayout(3,2));
        jp1.setLayout(new FlowLayout());

        jb1.addActionListener(this);

        jp1.add(jli);
        jp1.add(jtf1);

        jp2.add(jlp);
        jp2.add(jtf2);

        jp3.add(jb1);
        jp3.add(jb2);

        jp.add(jp1);
        jp.add(jp2);
        jp.add(jp3);

        jf.add(jp);



        jf.setSize(500,300);
        jf.setVisible(true);
    }
    public static void main(String[] args){
        new loginTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){
            jtf1.setText("kin");
            JOptionPane.showMessageDialog(null,"미구현된 기능입니다","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }
}
