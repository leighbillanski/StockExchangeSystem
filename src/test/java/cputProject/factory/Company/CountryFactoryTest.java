package cputProject.factory.Company;

import cputProject.domain.Company.Country;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryFactoryTest {

    @Test
    public void getCompany() {
        String name = "South Africa";
        Country country = CountryFactory.getCountry(name);
        assertNotNull(country.getCountryName());
    }
}