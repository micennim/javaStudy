package threadTest;

public class MyRunnableTest implements Runnable{
    String name;
    public MyRunnableTest(String str){
        name=str;
    }
    @Override
    public void run() {

        for(int i= 0 ; i<10; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + i);
        }
    }
    public static void main(String[] args){
        Thread t = new Thread(new MyRunnableTest("인"));
        Thread t1 = new Thread(new MyRunnableTest("진"));
        Thread t2 = new Thread(new MyRunnableTest("한"));
        t.start();
        t1.start();
        t2.start();
    }
}
