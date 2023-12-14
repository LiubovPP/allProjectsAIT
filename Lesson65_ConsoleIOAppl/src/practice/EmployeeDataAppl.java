package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeDataAppl {
    // считать из файла EmployeeData
    public static void main(String[] args) throws FileNotFoundException {

        try (BufferedReader br = new BufferedReader(new FileReader("Lesson65_ConsoleIOAppl/employees - Лист1.csv"))) {
            String str = br.readLine(); // считали 1-ю строку
            //System.out.println(str);
            String[] cells = str.split(",");
            printCells(cells);

            // total salary
            // total employees
            // avg salary
            // avg age
            // читаем по строкам и что можем, сразу считаем

            double salary = 0;
            int counter = 0;
            int age = 0;
            str = br.readLine();
            while (str!=null) {
                counter++;
                cells = str.split(",");
                salary += Double.parseDouble(cells[2]);
                LocalDate birthDate = LocalDate.parse(cells[3]);
                age += ChronoUnit.YEARS.between(birthDate, LocalDate.now());
                printCells(cells);
                str = br.readLine();
            }

            System.out.println("total salary "+salary);
            System.out.println("total employees "+counter);
            System.out.println("average salary "+ salary/counter);
            System.out.println("average age "+ age/counter);

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
