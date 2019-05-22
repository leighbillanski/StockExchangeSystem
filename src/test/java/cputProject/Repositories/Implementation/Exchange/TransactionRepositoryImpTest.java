package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.TransactionRepository;
import cputProject.domain.Exchange.Transaction;
import cputProject.factory.Exchange.TransactionFactory;
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
public class TransactionRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private TransactionRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = TransactionRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Transaction> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Transaction student = TransactionFactory.getTransavtion("bonsbcjbnd");
        Transaction result = comp.create(student);
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
        Transaction student = comp.read(id);
        Assert.assertNotNull(student);
    }
}