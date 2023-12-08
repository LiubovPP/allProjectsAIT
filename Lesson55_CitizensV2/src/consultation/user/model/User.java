package consultation.user.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class User implements Comparable<User>{
    //fields
    private String email;
    private String password;
    private String name;
    private String lastName;
    private int id;
  // private int age;
    private LocalDate birthDay;

    public User(String email, String password, String name, String lastName, int id,  LocalDate birthDay) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.id = id;
       // this.age = age;
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        return (int)ChronoUnit.YEARS.between(now, birthDay );
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public int compareTo(User o) {
        return Integer.compare(this.id,o.id);
    }
}
