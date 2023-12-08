package hwLesson16.pets;

import hwLesson16.pets.model.Pets;

public class PetApplication {
    public static void main(String[] args) {
        Pets pet1 = new Pets(01, "Cat", 10, "Musia");
        pet1.display();
        String name = pet1.getNickname();
        System.out.println(name);
        pet1.sleep();
        pet1.sleep();
        pet1.eat();
        pet1.sleep();
        pet1.makeSounds();
        pet1.eat();
        pet1.sleep();
        Pets pet2 = new Pets(02, "Dog", 1, "Meteor");
        pet2.display();
        String name2 = pet2.getNickname();
        System.out.println(name);
        pet2.makeSounds();
        pet2.eat();
        pet2.play();
        pet2.walk();
        pet2.play();
        pet2.sleep();
        Pets pet3 = new Pets(03, "Budgerigar", 5, "Kesha");
        pet1.makeSounds();
        pet2.eat();
        pet1.makeSounds();
        pet1.makeSounds();
        pet1.makeSounds();
        pet2.eat();
        pet1.makeSounds();
        pet1.makeSounds();
        pet2.makeSounds();

    }
}
