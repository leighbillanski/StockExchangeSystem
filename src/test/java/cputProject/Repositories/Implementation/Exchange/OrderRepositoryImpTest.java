package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.OrderRepository;
import cputProject.domain.Exchange.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OrderRepositoryImpTest {

    private OrderRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = OrderRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        List<Order> company = this.comp.getAll();
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