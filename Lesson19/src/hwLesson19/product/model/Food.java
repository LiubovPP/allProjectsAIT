package hwLesson19.product.model;

// Создать класс Food расширяющий класс Product с полем private String expDate;
// которое хранит дату истечения срока годности.
public class Food extends Product {
    private String expDate;


    public Food(String name, long barCode, double price, String expDate) {
        super(name, barCode, price);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return super.toString() + "Food " +
                "expDate='" + expDate + '\'' +
                '}';
    }
}
