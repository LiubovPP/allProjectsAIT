package hw_Lesson46.sportmen;

import java.util.Objects;

public class Sportmen implements Comparable<Sportmen>{
    private String firstName;
    private String lastName;
    private int id;
    private long resultInSeconds; // результат в секундах
    private String club;

    public Sportmen(String firstName, String lastName, int id, long resultInSeconds, String club) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.resultInSeconds = resultInSeconds;
        this.club = club;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getResultInSeconds() {
        return resultInSeconds;
    }

    public void setResultInSeconds(long resultInSeconds) {
        this.resultInSeconds = resultInSeconds;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportmen sportmen = (Sportmen) o;
        return id == sportmen.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Sportmen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", resultInSeconds=" + resultInSeconds +
                ", club='" + club + '\'' +
                '}';
    }

    @Override
    public int compareTo(Sportmen o) {
        int res = lastName.compareTo(o.lastName);
        return res!=0 ? res: this.firstName.compareTo(o.firstName);
    }
    public void displayTime() { // метод для перевода секунд в часы, минуты и секунды
        long hours = resultInSeconds / 3600;
        long minutes = (resultInSeconds % 3600) / 60;
        long remainingSeconds = resultInSeconds % 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, remainingSeconds);
    } // System.out.printf в Java используется для форматированного вывода. В данном случае, строка формата
    // "%02d:%02d:%02d%n" задает формат вывода для трех целочисленных значений, представляющих часы, минуты и секунды.
    //Таким образом, использование System.out.printf("%02d:%02d:%02d%n", hours, minutes, remainingSeconds); гарантирует
    // вывод времени в формате "часы:минуты:секунды", где каждый компонент времени представлен двумя символами, с
    // ведущими нулями при необходимости.
}
