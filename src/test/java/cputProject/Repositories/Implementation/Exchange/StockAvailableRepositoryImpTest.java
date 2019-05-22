package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockAvailableRepository;
import cputProject.domain.Exchange.Shares;
import cputProject.domain.Exchange.StockAvailable;
import cputProject.factory.Exchange.StockAvailableFactory;
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

public
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
class StockAvailableRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private StockAvailableRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = StockAvailableRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<StockAvailable> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        StockAvailable student = StockAvailableFactory.getAvailable(2555);
        StockAvailable result = comp.create(student);
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
        StockAvailable student = comp.read(id);
        Assert.assertNotNull(student);
    }
}