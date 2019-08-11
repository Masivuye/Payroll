package Payroll.service.impl;

import Payroll.domain.Race;
import Payroll.factory.RaceFactory;
import Payroll.repository.RaceRepository;
import Payroll.repository.impl.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImplTest {

    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace(" "," ","");
    }

    @Test
    public void create() {
        Race created = this.repository.create(this.race);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.race);
    }

    @Test
    public void update() {
        String newRace = "black";
        Race updated = new Race.Builder().white(newRace).build();
        System.out.println("In update, about_to_updated = " + race.getWhite());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newRace, updated.getWhite());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(race.getWhite());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, Race = "+ race.getWhite());
        Race read = this.repository.read(race.getWhite());
        getAll();
        assertNotEquals(race,read);
    }

    @Test
    public void getAll() {
        Set<Race> races = this.repository.getAll();
    }
}