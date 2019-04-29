package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.RegisterRepository;
import cputProject.domain.Login.Register;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RegisterRepositoryImpTest {

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
        this.comp.create(null);
        Assert.assertEquals(null, null);
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