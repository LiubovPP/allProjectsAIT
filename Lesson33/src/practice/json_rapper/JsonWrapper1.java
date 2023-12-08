package practice.json_rapper;
// имя:Леонид, возраст: 59 - это данные в одной программе
// {name: Leonid, age: 59}- это и есть Json, который передают другой программе и она его может "прочитать"(parsing)

public class JsonWrapper1 {
    // поле класса
    private Object value;

    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

      @Override
    public String toString() {
        return "{value"+ value + "}";
    }
}