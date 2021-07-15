package simple;

public class MyArrayAlgTest {
    public static void main(String[] args){
        String[] me = {"1","23","4"};
        MyArrayAlg.swap(me,2,0);
        for(String str:me){
            System.out.println(str);
        }
        String max=MyArrayAlg.getMax(me);
        String min=MyArrayAlg.getMin(me);
        System.out.println(max);
        System.out.println(min);

        int[] me2 =new int[3];
        me2[0]=1;
        me2[1]=2;
        me2[2]=4;
        /*MyArrayAlg.swap(me2[0],1,0);
        for(int i :me2){

        }*/
    }
}
