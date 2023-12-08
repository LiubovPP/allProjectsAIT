package practice.stringBuilder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        // StringBuilder - это класс, в нем есть полезные методы для работы со строками

        String str = "Java"; // обычный String
        // str = str + "_" + 11 - нужно это реализовать
        str = str.concat("_"); // concat - это склеивание
        str = str.concat("" + 11);// к строке добавляем примитив int
        System.out.println(str);

        //StringBuilder - mutable!
        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append("_").append(11); // append - добавить, можно снова добавлять через точку
        System.out.println(stringBuilder);// stringBuilder мутирует, его содержание изменилось
        stringBuilder.reverse(); // разворот строки задом наперед
        System.out.println(stringBuilder);
        // можно ли вернуть тип StringBuilder обратно в тип String?
        str = stringBuilder.toString(); //да, можно
        System.out.println(str);
    }
}
