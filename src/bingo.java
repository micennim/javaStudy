import java.util.Random;
import java.util.Scanner;

public class bingo {
    public static void main(String[] args){
        int[] bg = new int[25];
        int bgcnt = 0;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int result;
        for(int i=0; i<bg.length;i++){
            bg[i]=rd.nextInt(25)+1;
            for(int j=0; j<i; j++){
                if(bg[i]==bg[j]){
                    i--;
                }
            }
        }
        for(int i=0;i<25;i++){
            if(i%5==0){
                System.out.println();
            }
            System.out.print(bg[i]+"\t");
        }
        System.out.println("\nGame start\n");
        while(true){
            result=sc.nextInt();
            for(int i=0; i<bg.length; i++){
                if(bg[i]==result){
                    bg[i]=0;
                }
            }

            System.out.println();
            for(int i =0; i<5; i++){ //세로
                if(bg[i]==0&&bg[i+(1*5)]==0&&bg[i+(2*5)]==0&&bg[i+(3*5)]==0&&bg[i+(4*5)]==0){
                    bgcnt++;
                }
            }
            for(int i =0; i<5; i++){ //가로
                if(bg[i*5]==0&&bg[(i*5)+1]==0&&bg[(i*5)+2]==0&&bg[(i*5)+3]==0&&bg[(i*5)+4]==0){
                    bgcnt++;
                }
            }

            if(bg[0]==0&&bg[6]==0&&bg[12]==0&&bg[18]==0&&bg[24]==0){//왼->오 대각선
                bgcnt++;
            }
            if(bg[4]==0&&bg[8]==0&&bg[12]==0&&bg[16]==0&&bg[20]==0) {//오->왼 대각선
                bgcnt++;
            }
            System.out.println(bgcnt);
            if(bgcnt>2){
                for(int i=0;i<25;i++){
                    if(i%5==0){
                        System.out.println();
                    }
                    System.out.print(bg[i]+"\t");
                }
                System.out.println("\nBingo ! Game End"+args.length);
                break;
            }
            bgcnt=0;
        }

    }

}
