package Yacht.model.dao;

import Yacht.model.Yacht;

public interface YachtSet {
    boolean addYacht(Yacht yacht);
    boolean removeYacht(Yacht yacht);
    Iterable<Yacht> allYachts();
    Iterable<Yacht> allYachtsByMaterial();
    Iterable<Yacht> allYachtsByPriceMoreThan();
    Iterable<Yacht> allYachtsByYearRange();
    Iterable<Yacht> allYachtsDescendingOrderOfCost(); // по убыванию цены
    Double averageCostOfYachts();

}
