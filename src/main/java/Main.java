import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean isExit = true;
        while (isExit) {
            try {
                System.out.println("Select add/list/exit");
                Command choice = Command.valueOf(sc.next().toUpperCase().trim());
                switch (choice) {
                    case ADD:
                        try {
                            System.out.println("Animal choice: cat/dog/duck");
                            String animalName = sc.next();
                            Animal animal;
                            if (animalName.equals("cat")) {
                                animal = new Cat();
                                createAnimal(animal, sc);
                                animals.add(animal);
                                animal.say();
                            } else if (animalName.equals("dog")) {
                                animal = new Dog();
                                createAnimal(animal, sc);
                                animals.add(animal);
                                animal.say();
                            } else if (animalName.equals("duck")) {
                                animal = new Duck();
                                createAnimal(animal, sc);
                                animals.add(animal);
                                animal.say();
                            }
                        } catch (Exception e) {
                            System.out.println("Age or weight is incorrect");
                        }
                        break;
                    case LIST:
                        if (animals.size() > 0) {
                            animalList(animals);
                        } else {
                            System.out.println("List with animals is empty");
                        }
                        break;
                    case EXIT:
                        System.out.println("Exit");
                        isExit = false;
                        break;
                }
                break;
            } catch (Exception e) {
                System.out.println("Unknown command");
            }
        }
    }

    public static void createAnimal(Animal animal, Scanner scanner) {
        System.out.println("Write name");
        animal.setName(scanner.next());
        System.out.println("Write age");
        animal.setAge(scanner.nextInt());
        System.out.println("Write weight");
        animal.setWeight(scanner.nextInt());
        System.out.println("Write color");
        animal.setColor(scanner.next());
    }

    public static void animalList(List<Animal> animals) {
        for (int i = 0; i < animals.toArray().length; i++) {
            int old1 = animals.get(i).getAge();
            System.out.println("Hi! My name is " + animals.get(i).getName() +
                    ", me " + animals.get(i).getAge() + " " + Animal.declension(old1) +
                    ", my weight " + animals.get(i).getWeight() +
                    ", my color " + animals.get(i).getColor());

        }
    }
}
