package Payroll.repository.impl;

import Payroll.domain.Employee;
import Payroll.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();
    }

    private Employee findEmployee(final String lastName){
        return this.employees.stream()
                .filter(employee -> employee.getLasName().trim().equals(lastName))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRepositoryImpl getRepository() {
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee toDelete = findEmployee(employee.getLasName());
        if(toDelete != null){
            this.employees.remove(toDelete);
            return create(employee);
        }
        return null;
    }

    @Override
    public void delete(String empNum) {
        Employee employee = findEmployee(empNum);
        if (employee !=null) this.employees.remove(employee);
    }

    @Override
    public Employee read(final String empNum) {
        Employee employee = findEmployee(empNum);
        return employee;
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }
}
