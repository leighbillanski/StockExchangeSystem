package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BondsRepository;
import cputProject.domain.Exchange.Bonds;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BondsRepositoryImpTest {

    private BondsRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = BondsRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        List<Bonds> company = this.comp.getAll();
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