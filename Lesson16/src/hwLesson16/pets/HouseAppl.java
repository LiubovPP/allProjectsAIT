package hwLesson16.pets;

import hwLesson16.pets.model.Cat;
import hwLesson16.pets.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {
        Dog dog1 = new Dog(01,"Dog",8,"Finn", "Shepard", 65,45);
        dog1.display();
        dog1.eat();
        dog1.play();
        dog1.walk();
        dog1.voice();
        System.out.println();

        Dog dog2 = new Dog(02, "Dog", 3, "Meteor", "Labrador", 64, 40);
        dog2.display();
        dog2.eat();
        dog2.play();
        dog2.walk();
        dog2.voice();
        System.out.println();

        Cat cat1 = new Cat(01, "Cat", 2, "Murka", "without Breed", 25, 12);
        cat1.display();
        cat1.voice();
        cat1.eat();
        cat1.play();
        cat1.makeSounds();
        cat1.voice();
        System.out.println();

        Cat cat2 = new Cat(02, "Cat", 10, "Busia", "british", 25,15);
        cat2.display();
        cat2.voice();
        cat2.eat();
        cat2.eat();
        cat2.eat();
        System.out.println();

        Cat cat3 = new Cat(03,"Cat", 5,"Persik", "scottish", 23,10);
        cat3.display();
        cat3.eat();
        cat3.play();
        cat3.sleep();
        cat3.sleep();
        cat3.voice();
        System.out.println();
    }
}
