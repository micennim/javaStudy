package streamTest;

import java.io.*;
import java.util.Scanner;

public class ByteStreamsLab {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력하시오 :");
        String inName = sc.next();

        System.out.print("\n복사 파일 입력하시오 :");
        String outName = sc.next();

        try
                (InputStream is = new FileInputStream(inName);
            OutputStream os = new FileOutputStream(outName)){
                int c;

                while ((c=is.read())!=-1){
                    os.write(c);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
