import animals.Animal;
import animals.pets.Cat;
import animals.pets.Dog;
import animals.fly.Duck;
import data.Command;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static data.Command.*;


public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select add/list/exit");
            String userCommand = sc.next().toUpperCase().trim();
            boolean isCommandSupport = false;
            for (Command command : Command.values()) {
                if (command.name().equals(userCommand)) {
                    isCommandSupport = true;
                    break;
                }
            }

            if (!isCommandSupport) {
                System.out.println(String.format("This command %s is not found", userCommand));
                continue;
            }

            Command command = Command.valueOf(userCommand);

            switch (command) {
                case ADD:
                    System.out.println("Animal choice: cat/dog/duck");
                    String animalName = sc.next();
                    Animal animal;
                    if (animalName.equals("cat")) {
                        Cat cat = new Cat();
                        createAnimal(cat, sc);
                        animals.add(cat);
                        cat.say();
                    } else if (animalName.equals("dog")) {
                        Dog dog = new Dog();
                        createAnimal(dog, sc);
                        animals.add(dog);
                        dog.say();
                    } else if (animalName.equals("duck")) {
                        Duck duck = new Duck();
                        createAnimal(duck, sc);
                        animals.add(duck);
                        duck.say();
                    }
                    break;
                case LIST:
                    if (animals.size() > 0) {
                        animalList(animals);
                    } else {
                        System.out.println("List with animals is empty");
                    }
                    break;
                default:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
            }
        }
    }

    private static boolean isNumber(String numberStr) {
        try {
            Integer.parseInt(numberStr);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void createAnimal(Animal animal, Scanner scanner) {
        System.out.println("Write name");
        animal.setName(scanner.next());
        System.out.println("Write age");
        String ageStr = scanner.next();
        while (!isNumber(ageStr)) {
            System.out.println("Age is incorrect. Write age:");
            ageStr = scanner.next();
        }
        animal.setAge(Integer.parseInt(ageStr));
        System.out.println("Write weight");
        String weightStr = scanner.next();
        while (!isNumber(weightStr)) {
            System.out.println("Weight is incorrect. Write weight:");
            weightStr = scanner.next();
        }
        animal.setWeight(Integer.parseInt(weightStr));
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
