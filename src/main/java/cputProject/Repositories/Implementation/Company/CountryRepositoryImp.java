package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.CountryRepository;
import cputProject.domain.Company.Company;
import cputProject.domain.Company.Country;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryc")
public class CountryRepositoryImp implements CountryRepository {
    private static CountryRepositoryImp repo = null;
    private Map<String,Country> comp;

    private CountryRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static CountryRepositoryImp getRepo(){
        if(repo == null){
            repo = new CountryRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Country> getAll() {
        Collection<Country> students = this.comp.values();
        Set<Country> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Country create(Country company) {
        this.comp.put(company.getCountryCode(),company);
        return company;
    }

    @Override
    public Country update(Country company) {
        this.comp.replace(company.getCountryCode(),company);
        return this.comp.get(company.getCountryCode());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Country read(String company) {
        return this.comp.get(company);
    }

}
