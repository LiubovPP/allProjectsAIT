package practice.computers.model;
//создаем родительский класс Computer и дочерние классы Laptop и Smartphone.
//во всех классах переопределяем метод toString.
//создаем массив того, что есть "на складе" (создаем несколько объектов каждого класса).
//Считаем общий объем памяти на всех устройствах.
public class Computer {
//fields
    private String cpu; // центра́льное проце́ссорное устро́йство — ЦПУ; англ. central processing unit. процессор
    private int ram; // Операти́вная па́мять (англ. Random Access Memory, RAM — память с произвольным доступом)
    private int hdd; //жёсткий диск, разг. винчестер — запоминающее устройство (устройство хранения информации, накопитель)
    private String brand; // брэнд

    // конструктор
    public Computer(String cpu, int ram, int hdd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override // переопределение родительского класса
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", brand='" + brand + '\'' +
                '}';
    }
}
