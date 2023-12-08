package hwLesson16.pets.model;
//Задача 1. Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес. Создайте метод
//voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog. Создайте HouseAppl, в котором есть метод
// main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.
public class Cat extends Pets {
private String breedOfCat;
private double height;
private double weight;

    public Cat(int id, String kind, int age, String nickname, String breedOfCat, double height, double weight) {
        super(id, kind, age, nickname);
        this.breedOfCat= breedOfCat;
        this.height= height;
        this.weight= weight;
    }
 // пустой конструктор
    public Cat(int id, String kind, int age, String nickname) {
        super(id, kind, age, nickname);
    }

    public void voice () {
        System.out.println("The cat is meowing! Meow! Meow!");
    }

    public String getBreedOfCat() {
        return breedOfCat;
    }

    public void setBreedOfCat(String breedOfCat) {
        this.breedOfCat = breedOfCat;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display () {
super.display();
        System.out.println("This is " + breedOfCat + " cat, so high: "+ height+ " so heavy "+ weight);
    }
}
