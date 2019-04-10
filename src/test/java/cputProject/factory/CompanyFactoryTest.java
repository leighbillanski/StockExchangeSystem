package cputProject.factory;

import cputProject.domain.Company;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyFactoryTest {


    @Test
    public void getCompany() {
        String name = "Woorkpool";
        String product = "IT Service";
        Company company = CompanyFactory.getCompany(name,product);
        assertNotNull(company.getName(),company.getProduct());
    }
}