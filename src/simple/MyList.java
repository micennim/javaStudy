package simple;

import java.util.List;

public class MyList {
    public static void printList(List<?> list){
        for (Object elem : list)
            System.out.print(elem+"\t");
        System.out.println();
    }
}
