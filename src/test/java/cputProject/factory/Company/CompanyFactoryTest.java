package cputProject.factory.Company;

import cputProject.domain.Company.Company;
import cputProject.domain.Company.Product;
import cputProject.factory.Company.CompanyFactory;
import cputProject.util.Misc;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyFactoryTest {


    @Test
    public void getCompany() {
        String name = "Woorkpool";
        Company company = CompanyFactory.getCompany(name);
        assertNotNull(company.getProduct());
    }
}