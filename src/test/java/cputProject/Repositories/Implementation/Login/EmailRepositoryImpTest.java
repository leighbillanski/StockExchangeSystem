package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.EmailRepository;
import cputProject.domain.Login.Email;
import cputProject.factory.Login.EmailFactory;
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
public class EmailRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private EmailRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = EmailRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Email> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Email student = EmailFactory.getEmail("bo@nd.cpm");
        Email result = comp.create(student);
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
        Email student = comp.read(id);
        Assert.assertNotNull(student);
    }
}