package hwLesson16.student.model;

//Задача 2. Создать класс Студент (Student) с приватными полями:
//
//id
//имя
//фамилия
//год рождения
//специализация
//Стандартные методы:
//
//конструктор на все поля;
//геттеры и сеттеры на все поля;
//метод toString.
//Дополнительные методы:
//
//учиться
//взять отпуск
//сдать экзамен
//...
//В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.
public class Student {
    private int id;
    private String fname;
    private String lname;
    private int yearOfBirth;
    private String specialization;

    public Student(int id, String fname, String lname, int yearOfBirth, String specialization) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("ID: " + id + ", first name: " + fname + ", last name: "
                + lname + " , year of birth" + yearOfBirth + ", specialization: " + specialization);
    }

    public void learnWell() {
        System.out.println("The student learns well");
    }

    public void learnPoorly() {
        System.out.println("The student learns poorly");
    }

    public void takeVacation() {
        System.out.println("The student has taken a vacation");
    }

    public void passExam() {
        System.out.println("The student has passed an exam");
    }

    public void failExam() {
        System.out.println("The student has failed an exam");
    }
}
