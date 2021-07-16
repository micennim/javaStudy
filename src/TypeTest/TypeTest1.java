package TypeTest;

class A{
    A(){}
}

class B extends A{
    B(){}
}
public class TypeTest1 {
    A a = new B();

    public static void main(String[] args){
        double ab = 3.14;
        int ac = (int) ((Math.random()*6)+1);
        int i = (int) (ab);
        System.out.println(ac+" "+i);
    }
}
