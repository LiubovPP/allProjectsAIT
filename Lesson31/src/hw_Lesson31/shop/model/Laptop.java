package hw_Lesson31.shop.model;

public class Laptop extends Computer {
    private double hours;
    private double weight;

    public Laptop(int id, String cpu, int ram, int ssd, String brand, double hours, double weight, double price) {
        super(id, cpu, ram, ssd, brand, price);
        this.hours = hours;
        this.weight = weight;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }


    public double getWeight() {
        return weight;
    }

    public String toString() {
        return super.toString() + ", Hours: " + hours + ", Weight: " + weight;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Laptop)) {
            return false;
        }
        Laptop other = (Laptop) object;
        return super.equals(other) && hours == other.hours && weight == other.weight;
    }


}