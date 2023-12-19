package practice.tourists;

import java.util.Arrays;

public class Tourist {
    // нужен турист и страны, которые он посетил
    private String name;
    private String[] countryVisited;

    public Tourist(String name, String... countryVisited) { // это позволяет заводить
        // массивы разной длины
        this.name = name;
        this.countryVisited = countryVisited;
    }

    public String getName() {
        return name;
    }

    public String[] getCountryVisited() {
        return countryVisited;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", countryVisited=" + Arrays.toString(countryVisited) +
                '}';
    }
}
