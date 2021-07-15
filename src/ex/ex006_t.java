package ex;

public class ex006_t extends ex006_predator {
    static String food="apple";
    public String getFood(){
        System.out.print("tiger ");
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
