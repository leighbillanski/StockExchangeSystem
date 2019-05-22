package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.IndustryRepository;
import cputProject.domain.Company.Industry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class IndustryRepositoryImpTest {

    private IndustryRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = IndustryRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Industry> company = this.comp.getAll();
        Assert.assertEquals(0,company.size());
    }

    @Test
    public void create() {
        this.comp.create(null);
       // Assert.assertEquals(null, null);
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