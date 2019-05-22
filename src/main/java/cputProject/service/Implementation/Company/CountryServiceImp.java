package cputProject.service.Implementation.Company;

import cputProject.Repositories.Company.CountryRepository;
import cputProject.domain.Company.Country;
import cputProject.service.Company.CompanyService;
import cputProject.service.Company.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplc")
public class CountryServiceImp implements CountryService {
    @Autowired
    @Qualifier("InMemoryc")
    private CountryRepository repository;
    @Override
    public Set<Country> getAll() {
        return repository.getAll();
    }

    @Override
    public Country create(Country country) {
        return repository.create(country);
    }

    @Override
    public Country read(String country) {
        return repository.read(country);
    }

    @Override
    public Country update(Country country) {
        return repository.update(country);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}
