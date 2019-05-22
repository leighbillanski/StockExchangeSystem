package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.PasswordRepository;
import cputProject.domain.Login.Password;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class PasswordRepositoryImpTest {

    private PasswordRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = PasswordRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Password> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        this.comp.create(null);
       // Assert.assertEquals(null, null);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}