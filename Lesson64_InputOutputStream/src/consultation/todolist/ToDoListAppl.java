package consultation.todolist;

import consultation.todolist.dao.ToDoListImpl;
import consultation.todolist.model.Menu;
import consultation.todolist.model.Task;
import practice.employee_save_read.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task newTask = new Task(toDoList.quantity(), task);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber);
                    if (!(removedTask == null)) {
                        System.out.println(removedTask + " is removed.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Saving.... ");
                    List<Task> tasks = toDoList.getAllTasks();
                                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dest/toDoList.dat"))) {
                        oos.writeObject(tasks);
                                            System.out.println("Все записано в файл");
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Loading.... ");
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dest/toDoList.dat"))) {
                        // deserializing from stream of bytes to object
                        List<Task> readTasks = (List<Task>) ois.readObject();  // casting считываемого объекта Employee
                        readTasks.forEach(System.out::println); // распечатали
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
