package ex;

public class ex001 {
    public static void main(String[] arg){
        System.out.println("hi");
        System.out.println();
        int[][] b= new int[5][];
        b[0] = new int[10];
        b[1] = new int[9];
        b[2] = new int[8];
        b[3] = new int[7];
        b[4] = new int[6];
        String[] str = {"나는","인진한","입니다"};
        for(int i=0;i<b.length-1;i++){
            for(int j=0;j<b.length-1;j++){
                b[i][j]=b[i].length;
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        System.out.println(b[1][3]);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
