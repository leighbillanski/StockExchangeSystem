package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SellerRepository;
import cputProject.Repositories.Implementation.Company.CompanyRepositoryImp;
import cputProject.domain.Exchange.Seller;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SellerRepositoryImpTest {

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