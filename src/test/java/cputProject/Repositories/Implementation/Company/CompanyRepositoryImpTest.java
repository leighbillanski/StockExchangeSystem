package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.CompanyRepository;
import cputProject.domain.Company.Company;
import cputProject.factory.Company.CompanyFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CompanyRepositoryImpTest {

    private CompanyRepository comp;

    @Before
    public void setUp() throws Exception {
        this.comp = CompanyRepositoryImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Company> company = this.comp.getAll();
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