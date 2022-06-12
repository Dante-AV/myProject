package Task1;

public class Duck extends Animal implements Flying {
    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

    @Override
    public void Say() {
        System.out.println("Кря");
    }

}
