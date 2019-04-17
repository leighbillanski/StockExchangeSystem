package cputProject.factory.Company;

import cputProject.domain.Company.Country;
import cputProject.util.Misc;

public class CountryFactory {
    public static Country getCountry(String name ) {
        return new Country.Builder().countreyCode(Misc.generateId())
                .countryName(name)
                .build();
    }
}
