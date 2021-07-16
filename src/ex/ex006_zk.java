package ex;

public class ex006_zk {
    public void feed(ex006_predator predator){
        System.out.println("feed "+predator.getFood());
    }

    public void age(ex006_predator predator){
        System.out.println("age : "+predator.getAge());
    }

    public static void main(String[] args){
        ex006_zk zookeeper = new ex006_zk();
        ex006_t tiger = new ex006_t();
        ex006_l lion = new ex006_l();
        ex006_c cat = new ex006_c();
        tiger.setName("im");
        tiger.setFood("lion");
        lion.setFood("tiger");
        cat.setFood("tiger");
        tiger.setAge(10);
        lion.setAge(15);
        cat.setAge(27);

        tiger.getName();
        zookeeper.feed(tiger);
        zookeeper.feed(lion);
        zookeeper.feed(cat);
        zookeeper.age(tiger);
        zookeeper.age(lion);
        zookeeper.age(cat);
    }

}
