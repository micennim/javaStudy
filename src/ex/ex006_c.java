package ex;

public class ex006_c extends ex006_predator implements ex006_predInterface {
    String food;
    public String getFood(){
        System.out.print("cat ");
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
