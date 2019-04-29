package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserNameRepository;
import cputProject.domain.Login.UserName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class UserNameRepositoryImpTest {

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