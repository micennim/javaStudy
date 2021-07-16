package ex;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        int s=0;
        int b=0;
        int rdn; //랜덤 숫자
        int rdnd; //정답 숫자
        int rdns; // 랜덤 숫자 나머지 값 저장 변수
        int rdnds; // 정답 숫자 나머지 값 저장 변수
        int check=0; // 중복 숫자 체크 변수
        int jari;// 자리수
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("원하는 숫자 개수를 입력하시오");
            jari=sc.nextInt();
            if(jari>10){
                System.out.println("10개 이하로 입력하시오");
            }
        }while (jari>10);

        int[] n = new int[jari];
        int[] nd = new int[jari];
        int jegop=1;
        for(int i=0; i<jari; i++){
            jegop=jegop*10;
        }
        System.out.println(jegop+"");
        Random rd = new Random();


        while(true){// 안겹치는 숫자 n개 생성
            check=0;
            rdn=rd.nextInt(jegop);
            System.out.println(rdn);
            if(rdn<jegop/10){
                continue;
            }
            n[0]=rdn%10;//배열 나머지값 저장
            rdns=rdn/10;//
            for(int i=0; i<n.length-1; i++){
                n[i+1]=rdns%10;
                rdns=rdns/10;
            }
            for(int i=0;i<n.length;i++){
                for(int j=i+1;j<n.length;j++){
                    if(n[i]==n[j]){
                        check=1;
                        System.out.println("re   "+rdn+"    "+n[i]+" "+n[j]+ check);
                    }
                }

            }
            if(check==1){
                continue;
            }else if(check==0){
                break;
            }

        }

        System.out.println(rdn+"게임을 시작합니다.\n "+n.length+"자리 숫자를 입력하시오 : ");
        while(true){
            while (true) {
                try {
                    rdnd = sc.nextInt();
                    nd[0] = rdnd % 10;
                    rdnds = rdnd / 10;
                    for (int i = 0; i < n.length - 1; i++) {
                        nd[i + 1] = rdnds % 10;
                        rdnds = rdnds / 10;
                    }
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("정수를 입력하시오");
                    sc.next();
                    continue;
                }

            }
            for(int i=0;i<n.length;i++){
                System.out.print(n[i]+"\t");
            }
            System.out.println();
            for(int i=0;i<n.length;i++){
                System.out.print(nd[i]+"\t");
            }
            System.out.println();
            //스트라이크
            for(int i=0; i<n.length;i++){
                if(n[i]==nd[i]){
                    s++;
                }
            }
            //볼
            for(int i=0; i<n.length; i++){
                for(int j=0; j<n.length; j++){
                    if(i==j){
                        //System.out.print("check1 ");
                        continue;
                    }else{
                        //System.out.print("check2 ");
                        if(n[i]==nd[j]){

                            b++;
                        }
                    }
                }
            }

            if(s==n.length){
                System.out.println(rdn+"정답입니다");
                break;
            }else{
                System.out.println(s+"S "+b+"B");
                s=0;
                b=0;
            }
        }
    }
}
