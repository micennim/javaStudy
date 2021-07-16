package ex;

import java.util.Random;

public class ex002 {
    public static void main(String[] args){
        Random rd = new Random();
        int b=0;
        try{
            b= rd.nextInt(10);
            System.out.println("check1");
            String a= args[0];
            System.out.println("check2");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(b);
            System.out.println("배열범위 초과");
        }
        System.out.println(b);

    }
}
