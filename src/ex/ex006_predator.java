package ex;

public abstract class ex006_predator {
    String food;
    int age;
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println(name);
        return name;
    }
    public abstract String getFood();
    public abstract void setFood(String food);
    public abstract int getAge();
    public abstract void setAge(int age);
}
