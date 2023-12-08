package practice.city_bus;

import java.util.Objects;
// создать список городских маршрутов на основе автобусов из городского автопарка.
//подсчитать общую вместимость автобусов из автопарка.
public class Bus implements Comparable<Bus> {

    //fields
    private String model;
    private String regNumber; // регистрационный номер - подобие ID
    private String route; // маршрут
    private int busCapacity; // вместимость автобуса

    // constructor
    public Bus(String model, String regNumber, String route, int busCapacity) {
        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.busCapacity = busCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", route='" + route + '\'' +
                ", busCapacity=" + busCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(regNumber, bus.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public int compareTo(Bus o) { // надо отсортировать по маршруту и по вместимости
        int res = route.compareTo(o.route);
        return res != 0 ? res : - Integer.compare(this.busCapacity,o.busCapacity); // минус для обратной сортировки
    }

}
