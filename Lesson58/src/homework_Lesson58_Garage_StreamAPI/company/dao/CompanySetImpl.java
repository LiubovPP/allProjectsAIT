package homework_Lesson58_Garage_StreamAPI.company.dao;

import homework_Lesson58_Garage_StreamAPI.company.model.Employee;
import homework_Lesson58_Garage_StreamAPI.company.model.SalesManager;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class CompanySetImpl implements Company {
    private Set<Employee> employees;
    private int capacity;

    public CompanySetImpl(int capacity) {
        this.capacity = capacity;
        employees = new HashSet<>();
    }

    // O(1)
    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null) {
            throw new RuntimeException("Employee can not be null");
        }
        if (capacity == employees.size()|| employees.stream().anyMatch(employee1 -> employee1.getId()== employee.getId())) { // метод проверки на id SreamAPI
            return false;
        }
        return employees.add(employee);
    }

    // O(n)
    @Override
    public Employee removeEmployee(int id) {
//        Employee employee = findEmployee(id);
//        employees.remove(employee);
//        return employee;
        Employee employeeToRemove = employees.stream
                        ()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElse(null);

        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
        }

        return employeeToRemove;
    }

    // O(n)
    @Override
    public Employee findEmployee(int id) {
        return employees.stream().filter(employee -> employee.getId()== id).findFirst().orElse(null);
    }

    // O(n)
    @Override
    public double totalSalary() {
        return employees.stream().mapToDouble(Employee::calcSalary).sum();// mapToDouble преобразует каждого сотрудника
        // в его зарплату, а затем sum() суммирует все значения зарплаты, возвращая общую сумму.
    }

    @Override
    public double avgSalary() {
        return employees.stream()
                .mapToDouble(Employee::calcSalary)
                .average()
                .orElse(0.0);//stream().mapToDouble().average() используется для вычисления среднего значения
        // зарплаты. Метод orElse(0.0) используется в случае, если average() не возвращает значение, чтобы избежать
        // NullPointerException. Если множество сотрудников пусто, то среднее значение зарплаты будет равно 0.0.
    }

    // O(1)
    @Override
    public int quantity() {
        return employees.size();
    }

    // O(n)
    @Override
    public double totalSales() {
        return  employees.stream().filter(employee -> employee instanceof SalesManager)
                .mapToDouble(employee -> ((SalesManager)employee).getSalesValue()).sum();
    }

    // O(n)
    @Override
    public void printEmployees() {
        employees.forEach(e -> System.out.println(e));
    }

    // O(n)
    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
//        List<Employee> res = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (predicate.test(employee)) {
//                res.add(employee);
//            }
//        }
//        return res.toArray(new Employee[0]);
        return employees.stream()
                .filter(predicate)
                .toArray(Employee[]::new);
    }
}