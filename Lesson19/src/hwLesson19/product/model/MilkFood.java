package hwLesson19.product.model;

// Создать класс MilkFood расширяющий класс Food с полями private String milkType; private double fat;,
// которые хранят тип молока и жирность продукта соответственно.
public class MilkFood extends Food {
    private String milkType;
    private double fat;

    public MilkFood(String name, long barCode, double price, String expDate, String milkType, double fat) {
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
        return super.toString() + "MilkFood " +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }
}
