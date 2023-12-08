package company;

import company.model.Employee;
import company.model.Manager;
import company.model.SalesManager;
import company.model.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeAppl2 {
    public static void main(String[] args) {
        List<Employee> empl = new ArrayList<>();
//        Employee[] empl = new Employee[4];
        empl.add( new Manager(100, "John", "Smith", 45, 160, 3.5,
                "Specialist",5000, 5));
        empl.add(new SalesManager(101,"Anna", "Black", 36, 160, 1.5,
                "Specialist",25000, 0.1));
        empl.add(new SalesManager(102,"Thomas", "White", 28, 160, 2.5,
                "Bachelor",30000, 0.1));
        empl.add(new Worker(103, "Gans", "Bauer", 30, 80, 5.0,
                "Specialist",5));
        empl.add(new Worker(104, "Peter", "Donner", 32, 85, 4.0,
                "General school",5));



        Comparator<Employee> comparatorByExpierence = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getWorkExperience() - o2.getWorkExperience());
            }
        };
        System.out.println(    "-----------sorted by expierence--------------");
        empl.sort(comparatorByExpierence);
        for (Employee e:empl) {
            System.out.println(e);
        }

        Comparator<Employee> comparatorByEducation = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEducation().compareTo(o2.getEducation());
            }
        };
        System.out.println(    "-----------sorted by education--------------");
        empl.sort(comparatorByEducation);
        for (Employee e:empl) {
            System.out.println(e);
        }
    }
    private static double totalSalary(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                sum += empl[i].calcSalary();
            }
        }
        return sum;
    }

    private static double averageAge(Employee[] empl) {
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                average += empl[i].getAge();
            }
        }
        return average / empl.length;
    }

    private static double totalSales(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) empl[i];
                sum += salesManager.getSalesValue();
            }
        }
        return sum;
    }


}
