package practice.company.dao;

import practice.company.model.Employee;
import practice.company.model.SalesManager;

public class CompanyImpl implements Company {

    // поля, которые описывают компанию
    private Employee[] employees;//  массив для хранения сотрудников
    private int size;// текущее кол-во сотрудников в компании

    // конструктор
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // capacity - это максимальный размер компании
    }

    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) { // не добавляем null, не превышаем capacity, не добавляем уже существующего
            return false;
        }
//        employees[size] = employee;// новый элемент / то как раньше делали
//        size++;
        // новый вариант
        employees[size++] = employee; // ++ постфиксная операция
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {// size, т.к. не весь массив заполнен
            if (employees[i].getId() == id) {// нашелся элемент массива, у которого совпал ID
                Employee victim = employees[i];
                // можно написать короче
                // employees[i] = employees[size - 1];// на место найденного поставили последнего
//                employees[size - 1] = null;// обнулили последнего
//                size--;
                // so:
                employees[i] = employees[--size];// -- префиксная операция
                employees[size] = null; // т.к. уже длина уменьшилась
                return victim;
            }
        }
        return null;

    }

    @Override
    public Employee findEmployee(int id) {

        for (int i = 0; i < size; i++) {// size, т.к. не весь массив заполнен
            if (employees[i].getId() == id) {// нашелся элемент массива, у которого совпал ID
                return employees[i];// вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) employees[i];// провели кастинг
                res += salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    //Для выборки элементов из массива, удовлетворяющих заданному условию, надо сначала подсчитать количество элементов
//массива, удовлетворяющих условию. Потом создать массив под это количество, и только потом его заполнить. Для реализации
//такой функциональности, мы создаем методы возвращающие массив. Тестирование методов возвращающих массив,
//осуществляется при помощи assertArrayEquals.
    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        int count = 0;// считаем, сколько будет элементов, удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count];
        // заполняем массив res
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].getHours() > hours) {
                res[j++] = employees[i];
            }
        }
        return res;//возвращаем массив
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count = 0;// считаем, сколько будет элементов, удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee [] res = new Employee[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                res[j++] = employees[i]; // постфиксная операция
            }
        }
        return res;//возвращаем массив
    }
}
