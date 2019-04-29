package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockSoldRepository;
import cputProject.domain.Exchange.StockSold;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StockSoldRepositoryImpTest {

    private StockSoldRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = StockSoldRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        List<StockSold> company = this.comp.getAll();
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