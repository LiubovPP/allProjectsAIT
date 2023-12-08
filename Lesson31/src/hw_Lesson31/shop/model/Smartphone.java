package hw_Lesson31.shop.model;

public class Smartphone extends Laptop{
    private long imei;

    public Smartphone(int id, String cpu, int ram, int ssd, String brand, double hours, double weight, long imei, double price) {
        super(id, cpu, ram, ssd, brand, hours, weight, price);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    public String toString() {
        return super.toString() + ", IMEI: " + imei;
    }
    public boolean equals (Object object){
        if (!(object instanceof Smartphone)){
            return false;
        }
        Smartphone other = (Smartphone) object;
        return imei== other.imei;
    }

}