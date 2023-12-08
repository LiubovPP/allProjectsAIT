package homework_Lesson58_Garage_StreamAPI.garage.dao;

import homework_Lesson58_Garage_StreamAPI.garage.model.Car;

public interface Garage {

    boolean addCar(Car car);
    Car removeCar(String regNumber);
    Car findCarByRegNumber(String regNumber);
    Car[] findCarsByModel(String model);
    Car[] findCarsByCompany(String company);
    Car[] findCarsByColor(String color);
    Car[] findCarsByEngine(double min, double max);
    int size();
}
