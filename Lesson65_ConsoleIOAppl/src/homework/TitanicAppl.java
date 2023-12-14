package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Exercise 1. Calculate the total cost of travel.
//
//Task 2. Calculate the average fare for travel classes 1, 2, 3.
//
//Task 3. Calculate the total number of surviving and dead passengers.
//
//Task 4 Count the total number of surviving and deceased men, women and children (under 18 years of age).
//Считать файл tarin.csv, сделать расчеты:
//
//Задание 1. Подсчитайте общую стоимость проезда (выручка от рейса).
//
//Задание 2. Посчитайте средний тариф для 1,2,3 классов путешествия.
//
//Задание 3. Подсчитайте общее количество выживших и погибших пассажиров.
//
//Задание 4. Подсчитайте общее количество выживших и погибших мужчин, женщин и детей (до 18 лет).
public class TitanicAppl {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Lesson65_ConsoleIOAppl/train.csv"))) {
            String str = bufferedReader.readLine(); // считали первую строку
            String[] cells = str.split(","); // заносим в массив строк из строки
            List<CsvModel> listOfPassenger = new ArrayList<>();
            // printCells


            str = bufferedReader.readLine();
            while (str != null) {
                cells = str.split(",");
                double fare = Double.parseDouble(cells[10]);
                boolean isSurvived = cells[1].equals("1");
                int pcClass = Integer.parseInt(cells[2]);
                boolean isMale = cells[5].equals("male");
                double age = cells[6].length()==0 ? 19 : Double.parseDouble(cells[6]); // если возраст неизвестен, то считаем за взрослого

                listOfPassenger.add(new CsvModel(fare, pcClass, isSurvived, isMale, age));
                str = bufferedReader.readLine();
            }
            for (CsvModel csv:listOfPassenger
                 ) {
                System.out.println(csv);
            }
           double totalSum= listOfPassenger.stream()
                    .mapToDouble(m -> m.getFare()).sum();
            System.out.println("Total cost of travel " + totalSum);//Calculate the total cost of travel
           // Task 2. Calculate the average fare for travel classes 1, 2, 3.
            double avgFirstClass = listOfPassenger.stream()
                    .filter(f -> f.getPcClass() == 1)
                    .mapToDouble(CsvModel::getFare)
                    .average().orElse(0.0);
            System.out.println("Average fare for travel classes 1"+avgFirstClass);

            avgFirstClass = listOfPassenger.stream()
                    .filter(f -> f.getPcClass() == 2)
                    .mapToDouble(CsvModel::getFare)
                    .average().orElse(0.0);
            System.out.println("Average fare for travel classes 2"+avgFirstClass);

            avgFirstClass = listOfPassenger.stream()
                    .filter(f -> f.getPcClass() == 3)
                    .mapToDouble(CsvModel::getFare)
                    .average().orElse(0.0);
            System.out.println("Average fare for travel classes 3"+avgFirstClass);

            int allSurvived = listOfPassenger.stream()
                    .filter(s -> s.isSurvived())
                    .collect(Collectors.toList()).size();
            System.out.println("the total number of surviving  "+allSurvived);
            int allDeceased  = listOfPassenger.stream()
                    .filter(s -> !s.isSurvived())
                    .collect(Collectors.toList()).size();
            System.out.println("the total number of deceased  "+ allDeceased);// или отнять из listOfPassenger.size()

            //Задание 4. Подсчитайте общее количество выживших и погибших мужчин, женщин и детей (до 18 лет).

            long survivedMen = listOfPassenger.stream().filter(s -> s.isSurvived)
                    .filter(CsvModel::isMale).filter(s->s.age >=18).count();
            System.out.println("The total number of surviving  men "+survivedMen);
            // остальных по аналогии

            // System.out.println("Sum of survivors male: " + sumSurvMale); //sum of survivors male
            //            long sumDeathMale= list.stream()
            //                    .filter(s->!s.isSurvived)
            //                    .filter(s->!s.isFemale && s.getAge()>=18)
            //                    .count();
            //            System.out.println("Sum of death male: " + sumDeathMale);//sum of death male(0)
            //            long sumSurvFemale= list.stream()
            //                    .filter(s->s.isSurvived)
            //                    .filter(s->s.isFemale && s.getAge()>=18)
            //                    .count();
            //            System.out.println("Sum of survivors Female: " + sumSurvFemale);//sum of survivors female
            //            long sumDeathFemale= list.stream()
            //                    .filter(s->!s.isSurvived)
            //                    .filter(s->s.isFemale && s.getAge()>=18)
            //                    .count();
            //            System.out.println("Sum of death female: " + sumDeathFemale);//sum of death female(0)
            //            long sumSurvChildr= list.stream()
            //                    .filter(s->s.isSurvived)
            //                    .filter(s->s.getAge()<18)
            //                    .count();
            //            System.out.println("Sum of survivors children: " + sumSurvChildr);//sum of survivors children
            //            long sumDeathChild= list.stream()
            //                    .filter(s->!s.isSurvived)
            //                    .filter(s->s.getAge()<18)
            //                    .count();
            //            System.out.println("Sum of death children: " + sumDeathChild);//sum of death children(0)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printCells(String[] cells) {
        for (String str : cells
        ) {
            System.out.print(str + "\t");

        }
        System.out.println();
    }

}
