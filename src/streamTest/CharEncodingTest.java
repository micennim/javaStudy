package streamTest;

import java.io.*;

public class CharEncodingTest {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("d:\\input.txt");
                    BufferedReader in =
                    new BufferedReader(new InputStreamReader(new FileInputStream("d:\\output.txt"),"UTF8"));

        String str;
        while ((str=in.readLine())!=null){
            System.out.println(str);
        }
    }
}
