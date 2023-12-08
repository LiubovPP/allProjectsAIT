package homework_Lesson57.gender;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GenderAppl {

    public static void main(String[] args) {
                Map<Integer, Gender> employees = new HashMap<>();
        collectEmployeeData(employees);

        System.out.println("Отчет о гендерном составе коллектива:");
        printGenderComposition(employees);
    }

    private static void collectEmployeeData(Map<Integer, Gender> employees) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные сотрудников (номер сотрудника и гендер):");
        System.out.println("Для завершения ввода введите отрицательный номер.");

        while (true) {
            System.out.print("Номер сотрудника: ");
            int employeeNumber = scanner.nextInt();

            if (employeeNumber < 0) {
                break;
            }
            System.out.print("Гендер (MALE, FEMALE, NON_BINARY, GENDERQUEER, GENDERFLUID, OTHER): ");
            String genderInput = scanner.next().toUpperCase();
            Gender gender = Gender.valueOf(genderInput);

            employees.put(employeeNumber, gender );
        }
    }
    private static void printGenderComposition(Map<Integer, Gender> employees) {
        Map<Gender, Integer> genderCount = new HashMap<>();

        for (Gender gender : Gender.values()) {
            genderCount.put(gender, 0);
        }

        for (Gender gender : employees.values()) {
            genderCount.put(gender, genderCount.get(gender) + 1);
        }

        genderCount.forEach((gender, count) ->
                System.out.println(gender + ": " + count + " человек"));
    }
    public enum Gender {
        MALE, FEMALE, NON_BINARY, GENDERQUEER, GENDERFLUID, OTHER
    }
}
