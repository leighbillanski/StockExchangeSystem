package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.RegisterRepository;
import cputProject.domain.Login.Register;
import cputProject.factory.Login.RegisterFactory;
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

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class RegisterRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private RegisterRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = RegisterRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Register> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Register student = RegisterFactory.getRegister("kay@nsajdbk.com","leighaaaaa","bkdsjbfsdk");
        Register result = comp.create(student);
        id= result.getEmail();
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
        Register student = comp.read(id);
        Assert.assertNotNull(student);
    }
}