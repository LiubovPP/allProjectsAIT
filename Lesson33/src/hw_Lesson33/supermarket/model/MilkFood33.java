package hw_Lesson33.supermarket.model;

public class MilkFood33 extends Food33 {
    private String milkType;
    private double fat;

    public MilkFood33(String name, long barCode, double price, String expDate, String milkType, double fat) {
        super(name, barCode, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString() + "MilkFood33{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }
}
