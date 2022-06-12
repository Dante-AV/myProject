package Task2Menu;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Say() {
        System.out.println("I speak");
    }

    public void Go() {
        System.out.println("I'm going");
    }

    public void Drink() {
        System.out.println("I drink");
    }

    public void Eat() {
        System.out.println("I eat");
    }

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public static String declension(int count) {
        String one = "year";
        String two = "years";
        String five = "let";

        if (count > 100)
            count %= 100;

        if (count > 20)
            count %= 10;

        switch (count) {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }

    @Override
    public String toString() {
        return "Hi! My name is " + name + '\'' +
                ", me " + age +
                ", my weight " + weight +
                ", my color " + color + '\'';
    }
}
