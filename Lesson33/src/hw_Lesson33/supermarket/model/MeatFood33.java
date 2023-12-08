package hw_Lesson33.supermarket.model;

public class MeatFood33 extends Food33 {
    private String meatType;

    public MeatFood33(String name, long barCode, double price, String expDate, String meatType) {
        super(name, barCode, price, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return super.toString() + "MeatFood33{" +
                "meatType='" + meatType + '\'' +
                '}';
    }
}
