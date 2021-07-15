public class RaggedArray {
    public static void main(String[] args){
        int max_rows = 5;
        int[][] ragged = new int[max_rows+1][];
        for(int i = 0;i<=max_rows;i++){
            ragged[i]= new int[i+1];
        }
        for(int i = 0;i< ragged.length;i++){
            for(int j = 0; j<ragged[i].length; j++){
                ragged[i][j] = j;
                System.out.print(ragged[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(ragged.length);
    }
}
