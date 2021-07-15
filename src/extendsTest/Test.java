package extendsTest;


class base{
    public base(){
        System.out.println("base 생성자");
    }
}
class Derived extends base{
    public Derived(){
        super();
        System.out.println("Derived 생성자");
    }
}
public class Test {
    public static void main(String[] args){
        Derived r = new Derived();
    }
}
