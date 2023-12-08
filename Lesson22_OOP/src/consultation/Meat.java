package consultation;

public class Meat extends Product{
    private String type;

    public Meat(int id, double price, String name,String type) {
        super(id, price, name);
    this.type= type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
