package ex;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex008_trycatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=0;
        System.out.println("숫자를 입력하시오");
        while (true) {
            try {
                number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하시오");
                sc.next();
                continue;
            }
            if(number<10){
                sc.close();
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
