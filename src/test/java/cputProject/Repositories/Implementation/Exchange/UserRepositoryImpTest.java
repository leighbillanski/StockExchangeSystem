package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.UserRepository;
import cputProject.domain.Exchange.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class UserRepositoryImpTest {

    private UserRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = UserRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<User> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        this.comp.create(null);
        //Assert.assertEquals(null, null);
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