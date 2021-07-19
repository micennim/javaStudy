package threadTest;

public class ThreadTest {
    public static void main(String[] args){
        Runnable rab = ()->{

            for(int i=0; i<10; i++){
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        };
        new Thread(rab).start();
    }
}
