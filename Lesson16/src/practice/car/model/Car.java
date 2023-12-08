package practice.car.model;

public class Car {
    //поля класса:
    private String brand;
    private String color;
    private String modelOfCar;
    private int year;
    private double enginePower;
    private String fuelType;

    //конструктор класса Car:
    public Car(String brand, String color, String modelOfCar, int year, double enginePower, String fuelType) {
        this.brand = brand;
        this.color = color;
        this.modelOfCar = modelOfCar;
        this.year = year;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }

    //геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void displayCar() {
        System.out.println("Brand: " + brand + " model: " + modelOfCar + " engine: " + enginePower);
    }
}
