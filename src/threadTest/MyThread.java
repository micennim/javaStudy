package threadTest;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] arg){
        Thread t = new MyThread();
        t.start();
    }
}
