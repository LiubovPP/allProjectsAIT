package practice.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.dao.Company;
import practice.company.dao.CompanyImpl;
import practice.company.model.Employee;
import practice.company.model.Manager;
import practice.company.model.SalesManager;
import practice.company.model.Worker;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    Company company;
    Employee[] e;


    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager(102, "Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Gans", "Bauer", 30, 160, 5);
        // добавим элементы массива в Company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployee() {
        // не можем добавить пустого сотрудника - null
        assertFalse(company.addEmployee(null));
        // не можем добавить уже существующего сотрудника
        assertFalse(company.addEmployee(e[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dubin", 55, 160, 6000, 6);// создали нового сотрудника
        assertTrue(company.addEmployee(employee1));// добавили нового сотрудника
        assertEquals(5, company.quantity());// теперь в компании 5 сотрудников
        // создаем еще одного сотрудника
        Employee employee2 = new Manager(106, "Peter", "Dubin", 55, 160, 6000, 6);// создали нового сотрудника
        assertFalse(company.addEmployee(employee2));// не можем превысить capacity
        company.printEmployee();
        System.out.println("-------------------");
    }

    @Test
    void removeEmployee() {
        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity());// сотрудников стало на 1 меньше
        assertNull(company.removeEmployee(102));// дважды не можем удалить
        assertNull(company.findEmployee(102));
        company.printEmployee();
        System.out.println("-------------------");
       }

    @Test
    void findEmployee() {
        assertEquals(e[1], company.findEmployee(102));// ищем сотрудника по его id
        assertNull(company.findEmployee(105));// ищем не существующего сотрудника
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalary() {
        assertEquals(12100, company.totalSalary(), 0.01);
    }

    @Test
    void avgSalary() {
        assertEquals(3025, company.avgSalary(), 0.01);// (12100.0/4,...
    }

    @Test
    void totalSales() {
        assertEquals(55000, company.totalSales());
    }

    @Test
    void printEmployee() {
       company.printEmployee();
    }
}