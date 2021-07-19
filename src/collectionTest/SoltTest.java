package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int number;
    String name;

    public Student(int number,String name){
        this.number=number;
        this.name=name;
    }
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return number=o.number;
    }
}
public class SoltTest {
    public static void main(String[] args){
        Student ar[] = {
                new Student(1,"박덕규"),new Student(2,"이덕규"),
                new Student(3,"김덕큐")
        };
        List<Integer> il = new ArrayList<Integer>();

        for(int i=0; i<100; i++){
            il.add(i);
        }

        List<Student> ls = Arrays.asList(ar);
        System.out.println(ls);
        Collections.sort(ls);
        Collections.shuffle(ls);
        int serch = Collections.binarySearch(il,77);

        System.out.println(ls+""+serch);
    }
}
