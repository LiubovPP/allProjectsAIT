package homework.country;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class CountryImpl {
    public static void main(String[] args) {
        LinkedList <Country> countries = new LinkedList<>();
        System.out.println(countries.size());
        System.out.println(countries.isEmpty());

        countries.add(new Country("Germany", 83, "Europe"));
        countries.add(new Country("Brazil", 213, "South America"));
        countries.add(new Country("China", 1440, "Asia"));
        countries.add(new Country("South Africa", 60, "Africa"));
        countries.add(new Country("Australia", 25, "Oceania"));
        countries.add(new Country("Canada", 38, "North America"));
        countries.add(new Country("India", 1393, "Asia"));
        countries.add(new Country("Mexico", 126, "North America"));
        countries.add(new Country("Russia", 146, "Europe/Asia"));
        countries.add(new Country("Argentina", 45, "South America"));
        countries.add(new Country("Egypt", 104, "Africa"));
        System.out.println("-------Unsorted----------"); // до сортировки
        for (Country c:countries
        ) {
            System.out.println(c);
        }

        Collections.sort(countries);
        System.out.println(countries.size());
        System.out.println("-------Nature sort ----------");// после сортировки по алфавиту - натуральная сортировка по алфавиту
        for (Country c:countries
        ) {
            System.out.println(c);
        }

        Comparator<Country> comparatorByPopulation = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getPopulation() - o2.getPopulation();
            }
        };
        System.out.println("----------------Compared by Population-----------");
        Collections.sort(countries, comparatorByPopulation);
        for (Country c:countries
             ) {
            System.out.println(c);
        }

        Comparator<Country> comparatorByContinent = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getContinent().compareTo(o2.getContinent());
            }
        };
        System.out.println("----------------Compared by Population-----------");
        Collections.sort(countries, comparatorByContinent);
        for (Country c:countries
        ) {
            System.out.println(c);
        }

    }
}
