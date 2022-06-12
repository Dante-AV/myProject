package Task1;

public class Cat extends Animal {
    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Cat() {
        super();
    }

    @Override
    public void Say() {
        System.out.println("meow");
    }
}
