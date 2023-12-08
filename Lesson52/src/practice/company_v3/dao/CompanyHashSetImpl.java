package practice.company_v3.dao;

import practice.company_v3.model.Employee;
import practice.company_v3.model.SalesManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyHashSetImpl implements Company {
    // поля, которые описывают компанию

    private Set<Employee> employees; // вместо List делаем Set
    int capacity; // вместимость компании

    public CompanyHashSetImpl(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new HashSet<>(); // длину (размер) указывать не надо
    }
    // O(1) в худшем случае O (n)
    @Override
    public boolean addEmployee(Employee employee) {
        // не добавляем null, не превышаем capacity
        if (employee == null || employees.size() == capacity) {
            return false;
        }
        return employees.add(employee); // добавили в список сотрудника (элемент множества Set)
        // операция добавления и добавления из множества (Set) имеет сложность O (1)
    }
    // O(1) в худшем случае O (n)
    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        employees.remove(victim);
        return victim;
        // множества не содержат элемент null, поэтому проверка на наличие null не нужна
    }
    // O(n)
    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) { // e - это employee из множества employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return employees.size(); // вернули длину списка
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (Employee e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }
    // O(n)
    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if (e instanceof SalesManager) {
                //   SalesManager salesManager = (SalesManager) e; // проводим кастинг до нужного типа
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        employees.forEach(employee -> System.out.println(employee)); // отравляем все элементы на печать

    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
        List<Employee> res = new ArrayList<>();
        for (Employee e : employees
        ) {
            if (predicate.test(e)) {
                res.add(e);
            }

        }
        return res.toArray(new Employee[0] );// новинка !!
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return  findEmployeesByPredicate (e -> e.calcSalary() >= minSalary && e.calcSalary()< maxSalary);
    }
}
