package Payroll.repository.impl;

import Payroll.domain.Employee;
import Payroll.factory.EmployeeFactory;
import Payroll.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    /**
     *
     */
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee(" "," ");
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.employee);
    }

    @Test
    public void update() {
        String newName = " ";
        Employee updated = new Employee.Builder().lastName(newName).build();
        System.out.println("In update, about_to_update = " + employee.getLasName());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getLasName());
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getLasName());
    }

    @Test
    public void read() {
        System.out.println("In read, lastName = " + employee.getLasName());
        Employee read = this.repository.read(employee.getLasName());
        getAll();
        assertNotEquals(employee, read);
    }

    @Test
    public void getAll() {
        Set<Employee> getAll = this.repository.getAll();
    }
}