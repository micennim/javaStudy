package MyCounter;

public class MyCounterTest {
    public static void main(String[] args){
        MyCounter mc1 = new MyCounter(100);
        MyCounter mc2 = new MyCounter(200);

        System.out.println("객체 1의 counter = "+mc1.counter);
        System.out.println("객체 2의 counter = "+mc2.counter);
    }
}
