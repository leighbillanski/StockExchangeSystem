package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BrokerRepository;
import cputProject.domain.Exchange.Broker;
import cputProject.factory.Exchange.BrokerFactory;
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
public class BrokerRepositoryImpTest {
//@Autowired
    private String id=null;
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
        Broker student = BrokerFactory.getBroker("Kaylynn","Johnson");//.getBonds("bond");
        Broker result = comp.create(student);
        id= result.getId();
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
        Broker student = comp.read(id);
        Assert.assertNotNull(student);
    }
}