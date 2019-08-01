package Payroll.repository.impl;

import Payroll.domain.Race;
import Payroll.repository.RaceRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class RaceRepositoryImpl implements RaceRepository {

    private static  RaceRepositoryImpl repository = null;
    private Set<Race> raceTable;

    private RaceRepositoryImpl(){
        raceTable = new HashSet<>();
    }

    public static RaceRepository getRepository(){
        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }
    @Override
    public Set<Race> getAll() {
        return null;
    }

    @Override
    public Race create(Race race) {
        return null;
    }

    @Override
    public Race read(Integer integer) {
        return null;
    }

    @Override
    public Race update(Race race) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
