package streamTest;

import java.io.*;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:\\testtest.txt");
        BufferedReader br = new BufferedReader(fr);
        String plaintext = br.readLine();
        FileWriter fw = new FileWriter("D:\\outtest.txt");
        int c;

        while ((c=fr.read())!=-1){
            fw.write(c);
        }
        System.out.println(CaesarCipher.encode(plaintext,3));
        System.out.println(CaesarCipher.decode(CaesarCipher.encode(plaintext,3),3));

        fr.close();
    }
    public static String decode(String enc, int offset){
        return encode(enc,26-offset);
    }

    public static String encode(String enc, int offset){
        offset = offset%26+26;
        StringBuilder encoded = new StringBuilder();
        for(char i : enc.toCharArray()){
            if(Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26));
                }
            } else{
                encoded.append(i);
            }

        }
        return encoded.toString();
    }
}
