package Payroll.repository.impl;

import Payroll.domain.Gender;
import Payroll.factory.GenderFactory;
import Payroll.repository.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender(" "," ");
    }

    @Test
    public void create() {
        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.gender);
    }

    @Test
    public void update() {
        String newGender = " ";
        Gender updated = new Gender.Builder().female(newGender).build();
        System.out.println("In update, about_to_update = " + gender.getFemale());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newGender, updated.getFemale());
    }

    @Test
    public void delete() {
        this.repository.delete(gender.getFemale());
    }

    @Test
    public void read() {
        System.out.println("In read, gender = " + gender.getFemale());
        Gender read = this.repository.read(gender.getFemale());
        getAll();
        assertNotEquals(gender, read);
    }

    @Test
    public void getAll() {
        Set<Gender> all = this.repository.getAll();
    }
}