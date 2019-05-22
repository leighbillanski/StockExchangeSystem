package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BondsRepository;
import cputProject.domain.Company.Company;
import cputProject.domain.Exchange.Bonds;
import cputProject.factory.Company.CompanyFactory;
import cputProject.factory.Exchange.BondsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class BondsRepositoryImpTest {
    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private BondsRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = BondsRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Bonds> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Bonds student = BondsFactory.getBonds("bond");
        Bonds result = comp.create(student);
        id= result.getId();
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
        Bonds student = comp.read(id);
        Assert.assertNotNull(student);
    }
}