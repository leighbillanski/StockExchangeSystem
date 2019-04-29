package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SharesRepository;
import cputProject.domain.Exchange.Shares;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SharesRepositoryImpTest {

    private SharesRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = SharesRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        List<Shares> company = this.comp.getAll();
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