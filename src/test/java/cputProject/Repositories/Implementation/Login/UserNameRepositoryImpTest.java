package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserNameRepository;
import cputProject.domain.Login.UserName;
import cputProject.factory.Login.UserNameFactory;
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
public class UserNameRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private UserNameRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = UserNameRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<UserName> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        UserName student = UserNameFactory.getUserName("leighaaaaaa");
        UserName result = comp.create(student);
        id= result.getUserId();
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
        UserName student = comp.read(id);
        Assert.assertNotNull(student);
    }
}