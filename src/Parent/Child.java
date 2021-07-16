package Parent;

public class Child extends Parent{
    public void print(){
        super.print();
        System.out.println("자식 클래스의 메소드 호출");
    }
    public static void main(String[] args){
        Child obj = new Child();
        obj.print();
    }
}
