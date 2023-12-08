package post_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//**Задача:** Написать приложение, которое позволит понять,
// из каких мест на данную почту приходят письма.
public class PostAppl {
    public static void main(String[] args) {
        // Оператор  будет вводить индексы из приходящих писем, будем заносить в HashSet
        // в конце смены - распечатать hashSet

        Set<String> postcode = new HashSet<>();

        do {
            System.out.println("Welcome to post office!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input post code: ");

            String newPostCode = scanner.nextLine();
            if (postcode.add(newPostCode)) {
                System.out.println("The post code is added.");
            } else {
                System.out.println("The post code already exists.");
            }
            System.out.println("Continue? Press S to stop.");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("s")) {
                break;
            }
        }
        while (true);
        System.out.println("Post codes: " );
        System.out.println(postcode);

    }
}
