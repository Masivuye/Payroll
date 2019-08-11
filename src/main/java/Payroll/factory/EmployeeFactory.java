package Payroll.factory;

import Payroll.domain.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String firstName, String lastName){
        return new Employee.Builder().firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
