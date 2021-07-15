package Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.Timer;

class MyClass implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("deep");
    }
}

public class TimerTest {
    public static void main(String[] args){

        //ActionListener listener = new MyClass();
        Timer t = new Timer(1000, e -> System.out.println("hi"));
        t.start();
        for(int i =0; i<10; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            if (i==9){
                break;
            }
        }
        new Thread(()-> System.out.println("스레드 실행")).start();
    }

}
