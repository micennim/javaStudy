public class Car {
    int speed;
    Car(){
        System.out.println("속도는 "+speed);
    }
    {
        speed=100;
    }
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();
    }
}
