package ex;

public class ex006_l extends ex006_predator {
    String food;
    int age;
    public String getFood(){
        System.out.print("lion ");
        return food;
    }
    public void setFood(String food){
        this.food=food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }
}
