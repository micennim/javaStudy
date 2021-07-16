package simple;

public class simplePairTest {
    public static void main(String[] args){
        simplePair<String> sp = new simplePair<String>("aasd","dqwrwr");
        System.out.println(sp.getFirst());
        System.out.println(sp.getSecond());


        simplePair<Integer> sp2 = new simplePair<Integer>(18,1);
        System.out.println(sp2.getFirst());
        System.out.println(sp2.getSecond());
    }
}
