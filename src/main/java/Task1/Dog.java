package Task1;

public class Dog extends Animal {
    public Dog(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Dog() {
    }

    @Override
    public void Say() {
        System.out.println("woof");
    }
}
