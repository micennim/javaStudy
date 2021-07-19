package threadTest;

import collectionTest.CardGame;

import javax.swing.*;

public class CarGame extends JFrame {

    class MyThread1 extends Thread {
        private JLabel label;
        private int x,y;


        public MyThread1(String frame, int x, int y) {
            this.x = x;
            this.y = y;
            label = new JLabel(frame);
            label.setBounds(x, y, 0, 0);
            add(label);
        }

        public void run() {
            System.out.println("현재 실행중인 스레드" +activeCount());
            for (int i = 0; i < 250; i++) {
                if(x>1100){
                    try {
                        interrupt();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName()+" 골인");
                    break;

                }
                x += 30 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();

                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public CarGame(){
        setTitle("car game");
        setSize(1200,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        (new MyThread1("d:\\car1.png",10,0)).start();
        System.out.println("asdasdsa");
        (new MyThread1("d:\\car2.png",10,50)).start();
        (new MyThread1("d:\\car3.png",10,100)).start();

        setVisible(true);
    }

    public static void main(String[] args){
        CarGame cg =new CarGame();
    }
}
