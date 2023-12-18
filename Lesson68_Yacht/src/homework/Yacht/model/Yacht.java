package homework.Yacht.model;

import java.util.Objects;

public class Yacht implements Comparable<Yacht>{
    private String shipyard; // manufacturer - производитель
    private int yearOfIssue;
    private double length;
    private String bodyMaterial; //wood, plastic, metal
    private double price;

    public Yacht(String shipyard, int yearOfIssue, double length, String bodyMaterial, double price) {
        this.shipyard = shipyard;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.bodyMaterial = bodyMaterial;
        this.price = price;
    }

    public String getShipyard() {
        return shipyard;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getLength() {
        return length;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yacht yacht = (Yacht) o;
        return yearOfIssue == yacht.yearOfIssue && Double.compare(length, yacht.length) == 0 && Objects.equals(shipyard, yacht.shipyard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipyard, yearOfIssue, length);
    }

    @Override
    public int compareTo(Yacht o) {
        return Double.compare(getPrice(), o.getPrice());
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "shipyard='" + shipyard + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", length=" + length +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", price=" + price +
                '}';
    }
}
