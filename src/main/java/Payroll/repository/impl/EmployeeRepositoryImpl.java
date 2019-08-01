package Payroll.repository.impl;

import Payroll.domain.Employeee;
import Payroll.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employeee> employeeeTable;

    private EmployeeRepositoryImpl(){
        employeeeTable= new HashSet<>();
    }
    public static EmployeeRepository getRepository(){
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employeee> getAll() {
        return null;
    }

    @Override
    public Employeee create(Employeee employeee) {
        return null;
    }

    @Override
    public Employeee read(Integer integer) {
        return null;
    }

    @Override
    public Employeee update(Employeee employeee) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
