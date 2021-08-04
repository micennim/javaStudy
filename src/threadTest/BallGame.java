package threadTest;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class BallGame extends JFrame {
    Random rd = new Random();
    class ballThread extends Thread{
        private JLabel label;
        private int x,y;
        private int xg=1;
        private int yg=1;
        private int speed=0;

        public ballThread(String name, int x, int y1, int speed){
            this.x=x;
            this.y=y1;
            this.speed=speed;
            label = new JLabel(name);
            label.setBounds(x, y1, 0,0);
            add(label);
        }
        public void run(){
            for(int i=0;i<100000;i++){
                if(i==0){
                    if(rd.nextInt(2)==1){
                        xg=xg*-1;
                    }
                    if(rd.nextInt()==1){
                        yg=yg*-1;
                    }
                }
                if(x>1175){
                    xg=xg*-1;
                }else if(x<=0){
                    x=1;
                    xg=xg*-1;
                }
                if(y>=945){
                    yg=yg*-1;
                }else if(y<=0){
                    y=1;
                    yg=yg*-1;
                }
                x +=(speed+1)*xg;
                y +=(speed+1)*yg;
                label.setBounds(x,y,10,10);
                repaint();
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if(i%1000==0){
                    System.out.println(i);
                }
                if(i==9999){
                    System.out.println(x+","+y);
                }
            }
        }
    }
    public BallGame(){
        setTitle("ball game");
        setSize(1200,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        System.out.print("공 개수 입력 : ");
        int ballcount= new Scanner(System.in).nextInt();

        for(int i=0;i<ballcount;i++){
            (new ballThread("O",rd.nextInt(1170),rd.nextInt(940),rd.nextInt(4))).start();
        }







        setVisible(true);

    }
    public static void main(String[] args){
        BallGame bg = new BallGame();
    }

}
