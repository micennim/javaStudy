package simple;

public class MyArrayAlg {
    public static <T> void swap(T[] a,int i,int j){
        T tmp=a[i];
        a[i]=a[j];
        a[j]= tmp;
    }
    public static <T extends Comparable> T getMax(T[] a){
        if(a==null || a.length==0){ return null; }
        T largest = a[0];
        for(int i=1; i<a.length;i++)
            if(largest.compareTo(a[i])<0)
                largest=a[i];
            return largest;
    }
    public static <T extends Comparable> T getMin(T[] a){
        if(a==null || a.length==0){ return null; }
        T small = a[0];
        for(int i=1; i<a.length;i++)
            if(small.compareTo(a[i])>0)
                small=a[i];
        return small;
    }
}
