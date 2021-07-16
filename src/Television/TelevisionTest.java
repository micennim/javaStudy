package Television;

public class TelevisionTest {
    public static void main(String[] args){
        Television tv = new Television();
        tv.channel=11;
        tv.volume=16;
        tv.onOff=false;
        Television tv2 =tv;
        tv2.volume=9999;
        System.out.println("텔레비전의 채널은 "+tv.getChannel()+"이고 볼륨은 "+tv.volume+"입니다.");
        System.out.println("텔레비전의 채널은 "+tv2.channel+"이고 볼륨은 "+tv2.volume+"입니다.");
        tv.print();
    }
}
