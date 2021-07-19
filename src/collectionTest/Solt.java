package collectionTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solt {
    public static void main(String[] args){
        String[] sample = {"hello","my","name","is","jinhan"};
        List<String> list = Arrays.asList(sample);
        Collections.sort(list);
        System.out.println(list);
    }
}
