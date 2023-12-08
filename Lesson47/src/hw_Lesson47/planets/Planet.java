package hw_Lesson47.planets;

public class Planet {

    // fields
    protected String name;
    protected double distanceToTheSun;
    protected double mass;
    protected int numberOfSatelites;
    // constructor

    public Planet(String name, double distanceToTheSun, double mass, int numberOfSatelites) {
        this.name = name;
        this.distanceToTheSun = distanceToTheSun;
        this.mass = mass;
        this.numberOfSatelites = numberOfSatelites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfSatelites() {
        return numberOfSatelites;
    }

    public void setNumberOfSatelites(int numberOfSatelites) {
        this.numberOfSatelites = numberOfSatelites;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", distanceToTheSun=" + distanceToTheSun +
                ", mass=" + mass +
                ", numberOfSatelites=" + numberOfSatelites +
                '}';
    }
}
