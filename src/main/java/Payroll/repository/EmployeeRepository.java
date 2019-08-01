package Payroll.repository;

import Payroll.domain.Employeee;
import Payroll.repository.IRepository.IRepository;

import java.util.*;

public interface EmployeeRepository extends IRepository<Employeee, Integer> {
    Set<Employeee> getAll();
}
