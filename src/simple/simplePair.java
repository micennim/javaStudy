package simple;

public class simplePair<T> {
    private T data1;
    private T data2;

    public simplePair(T data1,T data2){
        this.data1=data1;
        this.data2=data2;
    }
    public T getFirst(){return data1;}
    public T getSecond(){return data2;}

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public void setData2(T data2) {
        this.data2 = data2;
    }
}
