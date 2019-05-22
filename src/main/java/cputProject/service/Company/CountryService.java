package cputProject.service.Company;

import cputProject.domain.Company.Country;
import cputProject.service.Service;

import java.util.Set;

public interface CountryService extends Service<Country,String> {
        Set<Country> getAll();
}
