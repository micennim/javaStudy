package streamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipTest {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("d:\\imzip.zip");
        ZipInputStream zin = new ZipInputStream(in);
        ZipEntry ze = null;

        while((ze=zin.getNextEntry())!=null){
            System.out.println("압축 해제 : "+ze.getName());
            FileOutputStream fout = new FileOutputStream("d:\\"+ze.getName());
            for(int c = zin.read(); c!=-1;c=zin.read()){
                fout.write(c);
            }
            zin.closeEntry();
            fout.close();
        }
        zin.close();
    }
}
