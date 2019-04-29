package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.EmailRepository;
import cputProject.domain.Login.Email;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmailRepositoryImpTest {

    private EmailRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = EmailRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        List<Email> company = this.comp.getAll();
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