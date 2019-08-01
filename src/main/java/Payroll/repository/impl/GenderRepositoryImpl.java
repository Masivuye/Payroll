package Payroll.repository.impl;

import Payroll.domain.Gender;
import Payroll.repository.GenderRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class GenderRepositoryImpl implements GenderRepository {
    @Override
    public Set<Gender> getAll() {
        return null;
    }

    @Override
    public Gender create(Gender gender) {
        return null;
    }

    @Override
    public Gender read(Integer integer) {
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
