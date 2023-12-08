package homework.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Задача 1. По аналогии с классом User создать класс Student с полями: id, firstName, lastName, birtDay, course,
// groupNum (номер группы), country, gender(пол). В приложении DekanatAppl создать студентов из разных стран, которые
// учатся на разных курсах, в разных группах. Сделать списки студентов по курсам, по группам, отсортированные по
// фамилиям и возрасту. Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем
// студентам? Дополнительное задание (**): добавить у каждого студента поле int[] marks с его оценками и рассчитать
// средний балл.
public class StudentAppl {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", "Doe", LocalDate.of(1997, 2, 01), 1, 101, "USA", "Male", new int[]{85, 90, 78}));
        students.add(new Student(2, "Jane", "Smith", LocalDate.of(1996, 8, 15), 2, 201, "Canada", "Female", new int[]{92, 88, 76}));
        students.add(new Student(3, "Annie", "Smith", LocalDate.of(1997, 6, 25), 2, 301, "England", "Female", new int[]{92, 88, 76}));
        students.add(new Student(4, "Joahn", "Berry", LocalDate.of(1998, 7, 25), 2, 201, "Ressland", "Female", new int[]{92, 88, 76}));
        students.add(new Student(5, "Leo", "Kill", LocalDate.of(1999, 6, 12), 3, 501, "Ukrane", "Male", new int[]{92, 88, 76}));
        students.add(new Student(6, "Jonny", "Depp", LocalDate.of(1999, 4, 1), 2, 301, "Germany", "Male", new int[]{92, 88, 76}));
        students.add(new Student(7, "Jim", "Kerry", LocalDate.of(2000, 6, 1), 5, 701, "Canada", "Male", new int[]{92, 88, 76}));
        students.add(new Student(8, "Angelina", "Jolly", LocalDate.of(1997, 10, 25), 4, 201, "Canada", "Female", new int[]{92, 88, 76}));
        students.add(new Student(9, "Sheron", "Stone", LocalDate.of(1995, 6, 7), 5, 601, "Canada", "Female", new int[]{92, 88, 76}));
        students.add(new Student(10, "Julia", "Roberts", LocalDate.of(1998, 6, 25), 4, 201, "Canada", "Female", new int[]{92, 88, 76}));
        students.add(new Student(11, "Terry", "Garr", LocalDate.of(1994, 6, 25), 3, 301, "Canada", "Male", new int[]{92, 88, 76}));

        printStudents(students);
        printStudentsInitials(students);
        printStudentsSortedByAge(students);
        printStudentsSortedByAgeAndNames(students);
        calcStudentsAvgAge(students);
        isAgeMoreThan(students, 25); // false
        isAgeMoreThan(students, 15); // true
        calcStudentsByCountries(students);
        double avgMarks = calcAvgMarksAllStudents(students);
        System.out.println(avgMarks);
        printStudentsGender(students);

    }

    private static void printStudentsGender(List<Student> students) {
        System.out.println("printStudentsGender ");
        System.out.println("------------------------------------------");
        long maleNum = students.stream().filter(student -> student.getGender().equalsIgnoreCase("male")).count();
        System.out.println("How many male students: " + maleNum);
        students.stream().filter(student -> student.getGender().equalsIgnoreCase("male")).forEach(System.out::println);
        System.out.println("------------------------------------------");
        long femaleNum = students.stream().filter(student -> student.getGender().equalsIgnoreCase("female")).count();
        System.out.println("How many female students: " + femaleNum);
        students.stream().filter(student -> student.getGender().equalsIgnoreCase("female")).forEach(System.out::println);
        System.out.println("------------------------------------------");
    }

    private static double calcAvgMarksAllStudents(List<Student> students) {
        System.out.println("calcAvgMarksAllStudents ");
        System.out.println("------------------------------------------");

        return students.stream().mapToDouble(Student::calculateAverageMark).average().orElse(0.0);


    }

    private static void calcStudentsByCountries(List<Student> students) {
        System.out.println("calcStudentsByCountries ");
        System.out.println("------------------------------------------");
        long countDifferentCountries = students.stream().map(Student::getCountry).distinct().count();
        System.out.println("Count Different countries:: " + countDifferentCountries);
        System.out.println("------------------------------------------");
    }

    private static void isAgeMoreThan(List<Student> students, int age) {
        System.out.println("isAgeMoreThan ");
        System.out.println("------------------------------------------");
        int checkAge = age;
        boolean isAgeGreaterThan = students.stream().allMatch(student -> student.getAge() > checkAge);
        System.out.println("Are the students grater than " + checkAge + " : " + isAgeGreaterThan);
        System.out.println("------------------------------------------");
    }

    private static void calcStudentsAvgAge(List<Student> students) {
        System.out.println("calcStudentsAvgAge ");
        System.out.println("------------------------------------------");
        double average = students.stream().mapToInt(Student::getAge).summaryStatistics().getAverage();
        System.out.println("AvgAge: " + average);
        System.out.println("------------------------------------------");
    }

    private static void printStudentsSortedByAgeAndNames(List<Student> students) {
        System.out.println("printStudentsSortedByAgeAndNames ");
        System.out.println("------------------------------------------");
        students.stream().sorted(Comparator.comparing(Student::getBirthDay).thenComparing(Student::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("------------------------------------------");
    }

    private static void printStudentsSortedByAge(List<Student> students) {
        System.out.println("printStudentsSortedByAge ");
        System.out.println("------------------------------------------");
        students.stream().map(student -> {
            return new Student(student.getId(),
                    student.getFirstName().charAt(0) + ".",
                    student.getLastName().charAt(0) + ".",
                    student.getBirthDay(),
                    student.getCourse(),
                    student.getGroupNumber(),
                    student.getCountry(),
                    student.getGender(),
                    student.getMarks());

        }).sorted(Comparator.comparing(Student::getBirthDay)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------------------------------------------");

    }

    private static void printStudentsInitials(List<Student> students) {
        System.out.println("printStudentsInitials ");
        System.out.println("------------------------------------------");
        students.stream().map(student -> {
                    return new Student(student.getId(),
                            student.getFirstName().charAt(0) + ".",
                            student.getLastName().charAt(0) + ".",
                            student.getBirthDay(),
                            student.getCourse(),
                            student.getGroupNumber(),
                            student.getCountry(),
                            student.getGender(),
                            student.getMarks());
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("------------------------------------------");
    }

    private static void printStudents(List<Student> students) {
        System.out.println("printStudents ");
        System.out.println("------------------------------------------");
        students.stream().forEach(System.out::println);
        System.out.println("------------------------------------------");
    }


}
