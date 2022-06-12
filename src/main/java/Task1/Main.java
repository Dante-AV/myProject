package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Animal("Bobik", 5, 15, "black"),
                new Animal("Bobik", 1, 15, "black"),
                new Animal("Bobik", 2, 15, "black")
        };

        Animal animal = new Animal("Bobik", 5, 15, "black");
        animal.Say();
        animal.Go();
        animal.Drink();
        animal.Eat();

        Cat cat = new Cat("Murka", 5, 15, "black");
        cat.Say();

        Duck duck = new Duck("Duck", 5, 15, "black");
        duck.Say();
        duck.fly();

        Dog dog = new Dog("Bobik", 5, 15, "black");
        dog.Say();

        for (int i = 0; i < animals.length; i++) {
            int old1 = animals[i].getAge();
            System.out.println("Hi! My name is " + animals[i].getName() +
                    ", me " + animals[i].getAge() + " " + Animal.declension(old1) +
                    ", my weight " + animals[i].getWeight() +
                    ", my color " + animals[i].getColor());
        }
    }
}
