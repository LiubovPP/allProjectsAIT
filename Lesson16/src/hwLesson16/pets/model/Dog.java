package hwLesson16.pets.model;
//Задача 1. Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес. Создайте метод
//voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog. Создайте HouseAppl, в котором есть метод
// main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.
public class Dog extends Pets{
    private String breedOfDog;
    private double height;
    private double weight;

    public Dog(int id, String kind, int age, String nickname, String breedOfDog, double height, double weight) {
        super(id, kind, age, nickname);
        this.breedOfDog=breedOfDog;
        this.height=height;
        this.weight=weight;
    }
    public void voice (){
        System.out.println("The dog is barking! Wow-Wow!");
    }
    public void display(){
        super.display();
        System.out.println("This is " + breedOfDog + " dog, so high: "+ height+ " so heavy "+ weight);
    }

    public String getBreedOfDog() {
        return breedOfDog;
    }

    public void setBreedOfDog(String breedOfDog) {
        this.breedOfDog = breedOfDog;
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
}
