package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SellerRepository;
import cputProject.Repositories.Implementation.Company.CompanyRepositoryImp;
import cputProject.domain.Exchange.Seller;
import cputProject.factory.Exchange.SellerFactory;
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

public
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
class SellerRepositoryImpTest {

    //@Autowired
    //private CountryRepository repository;
    private String id=null;
    private SellerRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = SellerRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Seller> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        Seller student = SellerFactory.getSeller("hound","dog");
        Seller result = comp.create(student);
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
        Seller student = comp.read(id);
        Assert.assertNotNull(student);
    }
}