package homework.Yacht;

import homework.Yacht.model.dao.YachtSetImpl;
import homework.Yacht.model.Yacht;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class YachtSetAppl {
    public static void main(String[] args) {
        YachtSetImpl yachtSet = new YachtSetImpl();
        List<Yacht> yachts = new ArrayList<>();
        yachts.add(new Yacht("Manufacturer4", 1905, 15.5, "Wood", 800.0));
        yachts.add(new Yacht("Lürssen", 2013, 180, "Metal", 10000.0));
        yachts.add(new Yacht("Blohm + Voss", 2009, 166.5, "Metal", 1000000.0));
        yachts.add(new Yacht("Manufacturer2", 2019, 28.0, "Metal", 120000.0));
        yachts.add(new Yacht("Manufacturer3", 2021, 35.5, "Plastic", 80000.0));

        System.out.println("All yachts: ");
        yachts.stream().forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("All yachts made from metal ");
        yachts.stream().filter(yacht -> yacht.getBodyMaterial().equalsIgnoreCase("metal")).forEach(System.out::println); // аналогично с другими материалами
        System.out.println("---------------------------------------");
        // display yachts more expensive than the specified price;
        double priceToSelect = 120000.0;
        System.out.println("All yachts more expensive than the specified price " + priceToSelect);
        yachts.stream().filter(yacht -> yacht.getPrice() > priceToSelect).forEach(System.out::println);
        System.out.println("---------------------------------------");
        int from = 2013;
        int to = 2022;
        System.out.println("All yachts in the range of years from " + from + " to " + to);
        //display yachts whose year of manufacture is in a given range;
        yachts.stream().filter(yacht -> yacht.getYearOfIssue() > from && yacht.getYearOfIssue() < to)
                .forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("All yachts sorted in descending order of cost");
        yachts.stream().sorted(Comparator.comparingDouble(Yacht::getPrice).reversed())
                .forEach(System.out::println);
        System.out.println("---------------------------------------");
        double avgCost = yachts.stream().mapToDouble(Yacht::getPrice).average().orElse((0.0));
        System.out.println("The average cost of a yacht from the created set " + avgCost);
    }
}
