package homework.Yacht.model.dao;

import homework.Yacht.model.Yacht;

import java.util.ArrayList;
import java.util.List;

public class YachtSetImpl implements YachtSet {
    List<Yacht> yachtList;

    public YachtSetImpl() {
      yachtList  = new ArrayList<>();
    }


    @Override
    public boolean addYacht(Yacht yacht) {
        return yacht!=null&& yachtList.add(yacht);
    }

    @Override
    public boolean removeYacht(Yacht yacht) {
        return false;
    }

    @Override
    public Iterable<Yacht> allYachts() {
        System.out.println("All yachts: ");
        yachtList.stream().forEach(System.out::println);
        return yachtList.stream().toList();
    }

    @Override
    public Iterable<Yacht> allYachtsByMaterial() {
        return null;
    }

    @Override
    public Iterable<Yacht> allYachtsByPriceMoreThan() {
        return null;
    }

    @Override
    public Iterable<Yacht> allYachtsByYearRange() {
        return null;
    }

    @Override
    public Iterable<Yacht> allYachtsDescendingOrderOfCost() {
        return null;
    }

    @Override
    public Double averageCostOfYachts() {
        return null;
    }
}
