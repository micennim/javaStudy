public class mainTest {
    public static void main(String[] args){
        int asd=152;
        System.out.println(args.length);
        if(args.length>0){
            for(int i=0;i<args.length;i++){
                System.out.println(" "+ args[i]);
            }
            if(args[0].equals("-h")){
                System.out.println("HELP");
            }

        }
    }
}
