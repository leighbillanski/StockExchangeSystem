package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.OrderRepository;
import cputProject.Repositories.Exchange.SecurityRepository;
import cputProject.domain.Exchange.Security;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SecurityRepositoryImpTest {

    private SecurityRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = SecurityRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Security> company = this.comp.getAll();
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