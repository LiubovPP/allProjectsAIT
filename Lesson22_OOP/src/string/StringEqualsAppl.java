package string;

public class StringEqualsAppl {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";//Объекты класса String создаваемые при помощи двойных кавычек, являются стринговыми
        //константами. Это означает, что когда мы каждый раз указываем стринг с одинаковым содержимым в двойных
        //кавычках, то новый объект не создается. Мы получаем ссылку на один и тот же объект.
        System.out.println(str1);
        System.out.println(str2);
        boolean checker = str1.equals(str2);
        System.out.println(checker);
        checker = str1 == str2; //  true  т.к. лежат в одной ячейке, один адрес
        System.out.println(checker);

        String str3 =new String("Hello");
        checker = str1 == str3; // false т.к. создан новый объект с новым адресом
        System.out.println(checker);
    }
}
