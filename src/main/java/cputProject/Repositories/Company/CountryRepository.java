package cputProject.Repositories.Company;

import cputProject.Repositories.Repository;
import cputProject.domain.Company.Country;

import java.util.Set;

public interface CountryRepository extends Repository<Country, String> {
    Set<Country> getAll();
}
