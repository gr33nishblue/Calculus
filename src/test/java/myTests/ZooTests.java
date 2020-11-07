package myTests;

import home.Animal;
import home.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTests {

    @Test
    void simpleTest() {
        Animal animal = new Animal();
        animal.setNrPicior(8);
        System.out.println(animal.getNrPicior());
    }

    @Test
    void simpleTest2() {
        Animal canisPitic = new Animal(4,true,"short",false,"none");
        System.out.println(canisPitic.getNrPicior());
        canisPitic.setNrPicior(3);
        System.out.println("canisPitic = " + canisPitic.getNrPicior());
        System.out.println("canisPitic = " + canisPitic);
        System.out.println("canisPitic.someMethod() = " + canisPitic.someMethod());
        System.out.println("canisPitic.someMethod() = " + Animal.someMethod());
    }

    @Test
    void testmethod3() {
        Animal canisPitic = new Animal(4,true,"short",false,"none");
        Animal altCanis = new Animal(4,true,"short",false,"none");
        assertEquals(canisPitic,altCanis);
        assertEquals(canisPitic.toString(),altCanis.toString());
    }

    @Test
    void testMethod4() {
        Dog newDog = new Dog();
        System.out.println("newDog = " + newDog);
        Animal newAnimal = newDog;
        System.out.println("newAnimal = " + newAnimal);
    }
}
