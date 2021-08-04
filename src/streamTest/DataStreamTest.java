package streamTest;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) throws IOException {
        DataInputStream in =null;
        DataOutputStream out = null;
        try {
            int c;
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("d:\\data.bin")));
            out.writeDouble(3.14);
            out.writeInt(100);
            out.writeUTF("나는 인진한 일까요?");
            out.flush();

            in = new DataInputStream(new BufferedInputStream(new FileInputStream("d:\\data.bin")));

            System.out.println(in.readDouble());
            System.out.println(in.readInt());
            System.out.println(in.readUTF());

        }finally {
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
        }
    }
}
