package ex;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Random rd = new Random();
        int random =rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int result=0;
        String check="";
        System.out.println("게임 시작");
        while (true){
            try{
                result=sc.nextInt();
            }catch (InputMismatchException e){
                e.printStackTrace();
                System.out.println("숫자를 입력하세요"+e.getMessage());
                sc.next();
                continue;
            }
            if(result>100){
                System.out.println("100이하의 정수를 입력하시오");
                continue;
            }else if(random>result){
                System.out.println("더 큰수 입니다.");
            }else if(random<result){
                System.out.println("더 작은수 입니다.");
            }else if(random==result){

                System.out.println(random+" 정답입니다.\n재시작 하시겠습니까 ? y/n");
                try{
                    check=sc.next();
                }catch (InputMismatchException e){
                    System.out.println("오류입니다");
                }
                if(check.equals("y")){
                    random = rd.nextInt(100);
                    System.out.println("게임을 재시작합니다.");
                    continue;
                }else if(check.equals("n")){
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }else{
                System.out.println("오류");
                break;
            }
        }
    }
}
