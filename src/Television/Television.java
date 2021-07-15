package Television;

public class Television implements RemoteControl {
    int channel;
    int volume;
    boolean onOff;
    void print(){
        System.out.println("텔레비전의 채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
    }
    int getChannel(){
        return channel;
    }

    public void turnOn() {
        onOff=true;
    }

    public void turnOff() {
        onOff=false;
    }

    public void volumeUp() {

    }

    public void volumeDown() {

    }

    public static void main(String[] args){
        Television tv = new Television();
        tv.channel=13;
        tv.volume=9;
        tv.onOff=false;

    }
}
