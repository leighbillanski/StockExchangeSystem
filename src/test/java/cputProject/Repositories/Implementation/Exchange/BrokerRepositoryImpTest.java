package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BrokerRepository;
import cputProject.domain.Exchange.Broker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BrokerRepositoryImpTest {


    private BrokerRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = BrokerRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Broker> company = this.comp.getAll();
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