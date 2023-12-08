package hw_Lesson47.planets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetsAppl {
    public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();

     planets.add(new Planet("Mercury", 0.39, 0.055, 0));
     planets.add(new Planet("Venus", 0.72, 0.815, 0));
     planets.add(new Planet("Earth", 1.0, 1.0, 1));
     planets.add(new Planet("Mars", 1.52, 0.107, 2));
     planets.add(new Planet("Jupiter", 5.2, 318, 79));
     planets.add(new Planet("Saturn", 9.58, 95, 83));
     planets.add(new Planet("Uranus", 19.22, 14, 27));
     planets.add(new Planet("Neptune", 30.05, 17, 14));

        System.out.println("-------------Planets of our Solar system: ---------------------");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
        System.out.println();

        Comparator<Planet> comparatorByName = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        planets.sort(comparatorByName);
        System.out.println(    "------------------ Planets sorted by name--------------");
        for (Planet p:planets) {
            System.out.println(p);
        }
        System.out.println();

        Comparator<Planet> comparatorDistance = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getDistanceToTheSun(),o2.getDistanceToTheSun());
            }
        };
        planets.sort(comparatorDistance);

        System.out.println(    "----------- Order of location in the solar system;--------------");
        for (Planet p:planets) {
            System.out.println(p);
        }

        System.out.println();

        Comparator<Planet> comparatorMass = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getMass(), o2.getMass());
            }
        };
        planets.sort(comparatorMass);
        System.out.println(    "----------- Planets sorted by mass--------------");
        for (Planet p:planets) {
            System.out.println(p);
        }

        System.out.println();

        Comparator<Planet> comparatorBySatelites = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getNumberOfSatelites(), o2.getNumberOfSatelites());
            }
        };
        planets.sort(comparatorBySatelites);
        System.out.println(    "----------- Planets sorted by number of satellites--------------");
        for (Planet p:planets) {
            System.out.println(p);
        }

    }
}
