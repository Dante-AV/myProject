package animals;

public class Duck extends Animal implements Flying {
    public Duck() {
        super();
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void say() {
        System.out.println("quack");
    }

}
