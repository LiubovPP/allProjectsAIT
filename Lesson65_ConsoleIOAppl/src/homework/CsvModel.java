package homework;

import java.util.Objects;

public class CsvModel {

    double fare;
    int pcClass;
    boolean isSurvived;
    boolean isMale;
    double age;

    public CsvModel( double fare, int pcClass, boolean isSurvived, boolean isMale, double age) {

        this.fare = fare;
        this.pcClass = pcClass;
        this.isSurvived = isSurvived;
        this.isMale = isMale;
        this.age = age;
    }



    public double getFare() {
        return fare;
    }

    public int getPcClass() {
        return pcClass;
    }

    public boolean isSurvived() {
        return isSurvived;
    }

    public boolean isMale() {
        return isMale;
    }

    public double getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CsvModel csvModel = (CsvModel) o;
        return pcClass == csvModel.pcClass && isSurvived == csvModel.isSurvived && isMale == csvModel.isMale && Double.compare(age, csvModel.age) == 0 && Objects.equals(fare, csvModel.fare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fare, pcClass, isSurvived, isMale, age);
    }

    @Override
    public String toString() {
        return "CsvModel{" +
                "fare=" + fare +
                ", pcClass=" + pcClass +
                ", isSurvived=" + isSurvived +
                ", isMale=" + isMale +
                ", age=" + age +
                '}';
    }
}
