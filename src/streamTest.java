import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class streamTest {
    public static void main(String[] a) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in=new FileInputStream("d:\\input.txt");
            out = new FileOutputStream("d:\\output.txt");
            int c;

            while ((c=in.read())!=-1){
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in==null){
                in.close();
            }
            if(out !=null){
                out.close();
            }
        }
    }
}
