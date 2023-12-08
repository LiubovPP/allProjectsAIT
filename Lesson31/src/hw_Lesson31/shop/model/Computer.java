package hw_Lesson31.shop.model;

public class Computer {
    protected int id;
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    protected double price;

    // constructor
    public Computer(int id, String cpu, int ram, int ssd, String brand, double price) {
        super();
        this.id =id;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price= price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Computer))// если object не Computer
        {
            return false;
        }
        Computer other = (Computer) object;
        return cpu.equals(other.cpu) && ram == other.ram && ssd == other.ssd && brand.equals(other.brand);
    }

}
