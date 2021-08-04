package streamTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args){
        FileReader is = null;
        FileWriter os = null;
        try{
            is =new FileReader("d:\\input.txt");
            os =new FileWriter("D:\\output2.txt");
            int c;
            while((c=is.read())!=-1){
                os.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
