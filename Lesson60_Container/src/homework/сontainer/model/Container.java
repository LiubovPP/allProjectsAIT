package homework.сontainer.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Container implements Iterable<Box> {
   //fields:
    private String label;
    private List<Box> boxes;

    public Container(String label) {
        this.label = label;
        //Задумайте случайное количество контейнеров (от 10 до 20).
        this.boxes = new ArrayList<>();
        int numBoxes = new Random().nextInt(11) + 10; // от 10 до 20 коробок
        for (int i = 0; i < numBoxes; i++) {
            boxes.add(new Box());

        }
    }
    // со StreamAPI
    //public Container(String label) {
    //        this.label = label;
    //        this.boxes = Stream.generate(Box::new)
    //                .limit(new Random().nextInt(11) + 10) // от 10 до 20 коробок
    //                .collect(Collectors.toList());
    //}
     //   или

    //
    //    public Stream<Box> boxStream() {
    //        return boxes.stream();
    //    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    @Override
    public Iterator iterator() {
        return boxes.iterator();
    }
}
