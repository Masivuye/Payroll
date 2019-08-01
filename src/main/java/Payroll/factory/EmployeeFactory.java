package Payroll.factory;

import Payroll.domain.Employeee;

public class EmployeeFactory {
    public static Employeee getEmployee(String firstName,String lastName){
        return new Employeee.Builder().firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
