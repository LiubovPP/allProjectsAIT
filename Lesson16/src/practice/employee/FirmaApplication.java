package practice.employee;

import practice.employee.model.Employee;

public class FirmaApplication {
    public static void main(String[] args) {
        Employee employee1 = new Employee(001, "John", "Smith", 45, 45000, true);
        employee1.display();
        Employee employee2 = new Employee(002, "Mary", "Poppins", 35, 45000, false);
        employee2.display();
        double totalSalary = employee1.getSalary() + employee2.getSalary();
        System.out.println("Total salary :" + totalSalary);
              employee1.work();
        employee1.sleep();
        employee1.lunch();
        System.out.println(employee1);// это мы использовали метод toString, который создали в капсуле
    }
}
