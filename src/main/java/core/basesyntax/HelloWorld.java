package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String hello;
    private int year;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    public String getFromOneToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(i).append(" ");
        }
        return result.toString();
    }

    public void sayHello() {
        System.out.println("Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file."
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
    }

    public void initializeVariables() {
        hello = "Hello mates!";
        System.out.println(hello);

        year = LocalDate.now().getYear();
        System.out.println("It is " + year + " year");

        age = 25;
        System.out.println("I'm " + age);

        size = 42;
        System.out.println("The size is " + size);
    }
}
