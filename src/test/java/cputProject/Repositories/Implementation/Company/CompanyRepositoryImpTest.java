package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.CompanyRepository;
import cputProject.domain.Company.Company;
import cputProject.factory.Company.CompanyFactory;
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



public class CompanyRepositoryImpTest {
    //@Autowired
   // private CompanyRepository repository;
    private String id=null;

    private CompanyRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = CompanyRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Company> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Company student = CompanyFactory.getCompany("CSG");
        Company result = comp.create(student);
        id= result.getCompanyId();
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
        Company student = comp.read(id);
        Assert.assertNotNull(student);
    }

}