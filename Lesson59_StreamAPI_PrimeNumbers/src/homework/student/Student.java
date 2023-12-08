package homework.student;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private int course;
    private int groupNumber;
    private String country;
    private String gender;
    int [] marks;


    public Student(int id, String firstName, String lastName, LocalDate birthDay, int course, int groupNumber, String country, String gender, int[] numbers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.course = course;
        this.groupNumber = groupNumber;
        this.country = country;
        this.gender = gender;
        this.marks = numbers;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDay, currentDate).getYears();
    }
    public double calculateAverageMark() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", course=" + course +
                ", groupNumber=" + groupNumber +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", numbers=" + Arrays.toString(marks) +
                '}';
    }
}
