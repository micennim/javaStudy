package ex;

class Number{
    static int num=0;
    int num2=0;
}
class Name{
    static String name="jinhan";
    static String name2="인진한";
    static void print(){
        System.out.println("My name is "+name);
    }
    void print2(){
        System.out.println("내 이름은 "+name2+"입니다");
    }

    public static void setName(String name) {
        Name.name = name;
    }

    public void setName2(String name2) {
        Name.name2 = name2;
    }
}
public class ex007_Number {
    public static void main(String[] args){
        Number n1 = new Number();
        Number n2 = new Number();

        n1.num++;
        n1.num2++;
        Name.print();
        Name nm = new Name();
        nm.print2();
        Name.setName("duck kyu");
        nm.setName2("덕규");
        nm.print();
        nm.print2();

        System.out.println("n1 : "+n2.num+"\nn2 : "+n2.num2);
    }
}
