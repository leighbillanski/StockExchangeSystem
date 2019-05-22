package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockRepository;
import cputProject.domain.Company.Company;
import cputProject.domain.Exchange.Stock;
import cputProject.factory.Company.CompanyFactory;
import cputProject.factory.Exchange.StockFactory;
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
public class StockRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private StockRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = StockRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Stock> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Stock student = StockFactory.getStock(CompanyFactory.getCompany("Birdies"));
        Stock result = comp.create(student);
        id= result.getStockId();
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
        Stock student = comp.read(id);
        Assert.assertNotNull(student);
    }
}