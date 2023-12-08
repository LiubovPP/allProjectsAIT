package hw_Lesson46;

import practice.city_bus.Bus;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentAppl {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Brown", 1, 28, "Maths"));
        students.add(new Student("Denny", "Boon", 2, 45, "Maths"));
        students.add(new Student("Sergius", "Fuhrmann", 3, 20, "Maths"));
        students.add(new Student("Christian", "Federl", 4, 40, "Maths"));
        students.add(new Student("Marion", "Reischl", 5, 55, "Maths"));
        students.add(new Student("Simon", "Carry", 6, 34, "Maths"));
        students.add(new Student("Anna", "Tett", 7, 18, "Maths"));

        System.out.println("-----------Unsorted List-----------------");

        // печать списка в столбик
        for (Student student : students
        ) {
            System.out.println(student);
        }
        System.out.println();

        students.sort(Student::compareTo);
        System.out.println("-----------Sorted List-----------------");

        // печать списка в столбик
        for (Student student : students
        ) {
            System.out.println(student);
        }
        System.out.println();

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        students.sort(comparator);
        System.out.println("-----------Sorted List by Age -----------------");

        // печать списка в столбик
        for (Student student : students
        ) {
            System.out.println(student);
        }
        System.out.println();

        int totalAge = 0;
        for (Student s : students
        ) {
            totalAge += s.getAge();
        }
        System.out.println("Total students age is " + totalAge);

        totalAge = 0;
        double totalStudents = 0;
        for (Student s : students
        ) {
            totalAge += s.getAge();
            totalStudents++;
        }
        double totalAvgAge = totalAge / totalStudents;
        System.out.println("Total students average age is " + totalAvgAge);

    }


}
