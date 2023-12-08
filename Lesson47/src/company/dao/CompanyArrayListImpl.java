package company.dao;

import company.model.Employee;
import company.model.SalesManager;

import java.util.ArrayList;
import java.util.List;
// ориентир CompanyImpl, см. этот class, его и рефакторим
public class CompanyArrayListImpl implements Company {
    //fields

//    private Employee[] employees; // сотрудники - массив для хранения сотрудников
//    private int size; // текущее кол-во сотрудников в компании

    List<Employee> employees;// вместо массива делаем List
    int capacity; // вместимость компании

    //// конструктор
    //    public CompanyImpl(int capacity) {
    //        employees = new Employee[capacity]; // capacity - максимальный размер компании
    //    }
    // конструктор
    public CompanyArrayListImpl(int capacity) {
        employees = new ArrayList<>(); // длину указывать не нужно
        this.capacity = capacity; // ограничение по кол-ву сотрудников в компании
    }
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null|| employees.size()==capacity|| findEmployee(employee.getId())!=null) {
            return false;
        }
        employees.add(employee); // добавили в список сотрудника (элемент списка)
        return true;

    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        if (victim != null) { // а надо ли это проверять
            employees.remove(victim);
            return victim;
        }
            return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e :employees) {
            if (e.getId()==id) // нашелся элемент массива, у которого совпал id
                return e;      // вернули найденный элемент массива типа Employee
        }
        return null;
    }

    @Override
    public int quantity() {
        return employees.size(); // вернули длину
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (Employee employee : employees) {
            res += employee.calcSalary();
        }
        return res;
    }
// О (n) - сложность линейная
    @Override
    public double avgSalary() {
        return totalSalary()/ employees.size();
    }
//О (n) - сложность линейная
    @Override
    public double totalSales() {
        double res = 0;
        for (Employee employee : employees) {
            if (employee instanceof SalesManager) {
//                SalesManager salesManager = (SalesManager) employee; // провели кастинг
                res += ((SalesManager) employee).getSalesValue();
            }
        }
        return res;
    }
// О (n) - сложность линейная
    @Override
    public void printEmployees() {
        for (Employee e: employees) {
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        int count = 0;
        // считаем сколько будет элементов массива, удовлетворяющих условию
        for (Employee emp : employees) {
            if (emp.getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count]; // создаем массив размером count
        // заполняем массив res
        count = 0;
        for (Employee emp : employees) {
            if (emp.getHours()> hours) {
                res[count] = employees.get(count);
                count++;
                }
        }
        return res; // это возвращаемый массив
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        // считаем сколько будет элементов массива, удовлетворяющих условию
        int count = 0;
        for (Employee e: employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee[] res = new Employee[count]; // создаем массив размером count
        count = 0;
        // заполняем массив res
        for (Employee e: employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                res[count] = e;
                count = count+1;
            }
        }
        return res; // это возвращаемый массив
    }

}
