package Task1;

public class Duck extends Animal implements Flying {
    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void Say() {
        System.out.println("quack");
    }

}
