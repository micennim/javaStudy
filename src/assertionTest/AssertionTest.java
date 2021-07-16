package assertionTest;

import java.util.Scanner;

public class AssertionTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 입력하시오 : ");
        int date = sc.nextInt();


        assert false;
        System.out.println("입력된 날짜는 "+date+"입니다.");
    }
}
