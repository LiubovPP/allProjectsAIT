package homework.сontainer.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Box implements Iterable<Parcel> {
    private List<Parcel> parcels;
    // со StreamAPI
//public Box() {
    Random random = new Random();
//        this.parcels = Stream.generate(() -> new Parcel(random.nextDouble(0,2)))
//                .limit(new Random().nextInt(6) + 5) // от 5 до 10 посылок
//                .collect(Collectors.toList());
//    }
//
//    public Stream<Parcel> parcelStream() {
//        return parcels.stream();
//    }
    public Box() {
        // В каждой коробке задумайте случайное количество посылок (от 5 до 10).
        this.parcels = new ArrayList<>();
        int numParcels = new Random().nextInt(6) + 5; // от 5 до 10 посылок
        for (int i = 0; i < numParcels; i++) {
            parcels.add(new Parcel(2.0)); // Вес каждой посылки считаем как 2 кг
        }
    }

        public List<Parcel> getParcels () {
            return parcels;
        }

        public void setParcels (List < Parcel > parcels) {
            this.parcels = parcels;
        }


        @Override
        public Iterator<Parcel> iterator () {
            return parcels.iterator();
        }
    }
