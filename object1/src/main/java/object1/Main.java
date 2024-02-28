package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("Matt",39,120);
        System.out.println(person1.height);

        Dog dog1 = new Dog("Tucker", 2, "Hound" );
        System.out.println(dog1.getName());

        Chair chair1 = new Chair("Oak", "Brown", 4);
        System.out.println(chair1.getMaterial());

        Car car1 = new Car("Nissan", "D21", 1994, 205000);
        System.out.println(car1.getMake());

        PersonArray[] people = new PersonArray[2];
        PersonArray personArray1 = new PersonArray("Matt", 39);
        PersonArray personArray2 = new PersonArray("Anthony", 30);
        System.out.println(people.length);
        System.out.println();
    }
}
