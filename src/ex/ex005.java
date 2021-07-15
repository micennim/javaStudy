package ex;

public class ex005 {
    static String name;
    static int age=0;
    static int reg=2;

    void setName(String name){
        this.name=name;
    }

    void setAge(int age){
        age++;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println("나이먹는중");
    }

    static int setReg(){
        System.out.println(reg);
        return reg;
    }
    int getAge(){
        return age;
    }


    public static void main(String[] args){

    }
}
