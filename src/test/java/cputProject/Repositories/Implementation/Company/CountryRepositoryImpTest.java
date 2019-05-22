package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.CompanyRepository;
import cputProject.Repositories.Company.CountryRepository;
import cputProject.domain.Company.Company;
import cputProject.domain.Company.Country;
import cputProject.factory.Company.CountryFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Set;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class CountryRepositoryImpTest {
   // @Autowired
    //private CountryRepository repository;
    private String id=null;
    private CountryRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = CountryRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Country> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Country student = CountryFactory.getCountry("South Africa");
        Country result = comp.create(student);
        id= result.getCountryCode();
        Assert.assertNotNull(student);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
        Country count = comp.read(id);
        Assert.assertNotNull(count);
    }
}