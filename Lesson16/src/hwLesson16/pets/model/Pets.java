package hwLesson16.pets.model;
//Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:
//
//id
//вид
//возраст
//кличка
//Стандартные методы:
//
//конструктор на все поля;
//геттеры и сеттеры на все поля;
//метод toString.
//Дополнительные методы:
//
//спать
//есть
//делать звук
//играть
//гулять
//В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.
public class Pets {
    private int id;
    private String kindOfAnimal;
    private int age;
    private String nickname;

    public Pets(int id, String kind, int age, String nickname) {
        this.id = id;
        this.kindOfAnimal = kind;
        this.age = age;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKind() {
        return kindOfAnimal;
    }

    public void setKind(String kind) {
        this.kindOfAnimal = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void display() {
        System.out.println("ID: " + id + ", kind of the animal: " + kindOfAnimal + ", age of the animal: "
                + age + ", nickname of the animal: " + nickname);
    }
    public void sleep (){
        System.out.println(this.getNickname()+" The Animal is sleeping!");
    }
    public void eat (){
        System.out.println("The animal is eating now.");
    }
    public void makeSounds (){
        System.out.println("The animal is makind sounds!");
    }
    public void play (){
        System.out.println("The animal is playing!");

    }
    public void walk (){
        System.out.println("The animal is walking outside.");
    }

}
