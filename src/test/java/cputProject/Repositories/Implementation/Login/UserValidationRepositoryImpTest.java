package cputProject.Repositories.Implementation.Login;

import cputProject.Repositories.Login.UserValidationRepository;
import cputProject.domain.Login.UserValidation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserValidationRepositoryImpTest {

    private UserValidationRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = UserValidationRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        List<UserValidation> company = this.comp.getAll();
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