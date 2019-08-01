package Payroll.repository;

import Payroll.domain.Race;
import Payroll.repository.IRepository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race,Integer> {
    Set<Race> getAll();
}
