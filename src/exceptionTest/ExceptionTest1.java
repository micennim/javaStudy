package exceptionTest;

class MyExcption extends Exception{
    public MyExcption(){
        super("무슨 오류인지 안알려줄건데요?");
    }
}

public class ExceptionTest1 {
    public static void main(String[] args){
        try{
            method1();
        }catch (MyExcption e){
            System.out.println(e.getMessage()+"\n호출 스택 내용 : ");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void method1() throws Exception {
        throw new MyExcption();
    }
}
