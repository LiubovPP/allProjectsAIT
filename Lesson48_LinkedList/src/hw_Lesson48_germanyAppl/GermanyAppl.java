package hw_Lesson48_germanyAppl;

import java.util.LinkedList;

public class GermanyAppl {
    public static void main(String[] args) {
        LinkedList<String> germanCities = new LinkedList<>();

        // Добавляем города
        germanCities.add("Berlin"); // Берлин - столица Германии
        germanCities.add("Hamburg"); // Гамбург
        germanCities.add("Munich"); // Мюнхен
        germanCities.add("Cologne"); // Кёльн
        germanCities.add("Frankfurt"); // Франкфурт
        germanCities.add("Stuttgart"); // Штутгарт
        germanCities.add("Dusseldorf"); // Дюссельдорф
        germanCities.add("Dresden"); // Дрезден
        germanCities.add("Hannover"); // Ганновер

        System.out.println(germanCities);// посмотрим список

        germanCities.add(3, "Hamburg"); // добавим Гамбург
        System.out.println("______________________________________");
        System.out.println("New order of cities: "+germanCities); // снова посмотрим список

        germanCities.addFirst("Potsdam"); // добавим на первое место в список
        System.out.println("______________________________________");
        System.out.println(germanCities);// снова посмотрим список
    }
}
