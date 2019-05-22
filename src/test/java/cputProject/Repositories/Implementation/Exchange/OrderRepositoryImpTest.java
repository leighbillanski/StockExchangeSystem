package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.OrderRepository;
import cputProject.domain.Exchange.Order;
import cputProject.factory.Exchange.OrderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class OrderRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private OrderRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = OrderRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Order> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Order student = OrderFactory.getOrder("jbdskvchsdb");
        Order result = comp.create(student);
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
        id="12454";
        Order student = comp.read(id);
        Assert.assertNotNull(student);
    }
}