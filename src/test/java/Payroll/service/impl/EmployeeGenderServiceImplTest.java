package Payroll.service.impl;

import Payroll.domain.Gender;
import Payroll.factory.GenderFactory;
import Payroll.repository.GenderRepository;
import Payroll.repository.impl.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {

    private GenderRepository repository;
    private Gender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.employeeGender = GenderFactory.getGender(" "," ");
    }

    @Test
    public void create() {
        Gender created = this.repository.create(this.employeeGender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.employeeGender);
    }

    @Test
    public void update() {
        String newGender = "W89494";
        Gender updated = new Gender.Builder().female(newGender).build();
        System.out.println("In update, about_to_updated = " + employeeGender.getFemale());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newGender, updated.getFemale());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(employeeGender.getFemale());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, employee ID = "+ employeeGender.getFemale());
        Gender read = this.repository.read(employeeGender.getFemale());
        getAll();
        assertNotEquals(employeeGender,read);
    }

    @Test
    public void getAll() {
        Set<Gender> genders = this.repository.getAll();
    }
}