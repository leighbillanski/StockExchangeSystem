package cputProject.service.Implementation.Company;

import cputProject.Repositories.Implementation.Company.CompanyRepositoryImp;
import cputProject.domain.Company.Company;
import cputProject.factory.Company.CompanyFactory;
import cputProject.factory.Company.ProductFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompanyServiceImpTest {

    private CompanyRepositoryImp repository;
    private Company course;

    private Company getSaved(){
        return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {
        this.repository = CompanyRepositoryImp.getRepo();
        this.course = CompanyFactory.getCompany("Woody");
    }

    @Test
    public void getAll() {
        Set<Company> courses = this.repository.getAll();
    }

    @Test
    public void create() {
        Company created = this.repository.create(this.course);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
        Company updated = new Company.Builder().name("BJKbi").product(ProductFactory.getProduct("jdbskfj")).build();
        this.repository.update(updated);
        Assert.assertSame("BJKbi", updated.getName());
    }

    @Test
    public void delete() {
    }
}