package streamTest;

import java.io.*;
import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args){
        Scanner sc=null;

        double sum=0;
        PrintWriter out = null;

        try {
            out=new PrintWriter(new FileWriter("d:\\output4.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("9.5");
        out.println("567,000");
        out.print("9.5");
        out.flush();

        try {
            sc = new Scanner(new BufferedReader(new FileReader("d:\\output4.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(sc.hasNext()){
            if(sc.hasNextDouble()){
                sum+=sc.nextDouble();
            }else{
                sc.next();
            }

        }
        if(out!=null){
            out.close();
        }
        if(sc!=null){
            sc.close();
        }
        System.out.println(sum);
    }
}
