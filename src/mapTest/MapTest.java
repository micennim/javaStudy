package mapTest;

import java.util.HashMap;
import java.util.Map;

class Student{
    int number;
    String name;
    public Student(int number, String name){
        this.number=number;
        this.name=name;
    }
    public String toString(){
        return name;
    }
}

public class MapTest {
    public static void main(String[] args){
        Map<String,Student> st = new HashMap<String,Student>();
        st.put("123456",new Student(789456,"덕규"));
        st.put("147258",new Student(369258,"덕우"));
        st.put("159357",new Student(357159,"재형"));
        System.out.println(st);

        st.remove("123456");
        System.out.println(st);
        st.put("123456",new Student(789456,"덕규"));
        System.out.println(st.get("147258"));
        System.out.println("Key="+st.entrySet());
        for(Map.Entry<String, Student> s:st.entrySet()){
            System.out.println("key = "+s.getKey()+"" + "\tvalue = " +s.getValue());
        }
    }
}
