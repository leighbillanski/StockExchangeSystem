package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.CountryRepository;
import cputProject.domain.Company.Company;
import cputProject.domain.Company.Country;

import java.util.HashSet;
import java.util.Set;

public class CountryRepositoryImp implements CountryRepository {
    private static CountryRepositoryImp repo = null;
    private Set<Country> con;

    private CountryRepositoryImp(){
        this.con = new HashSet<>();
    }

    public static CountryRepositoryImp getRepo(){
        if(repo == null){
            repo = new CountryRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Country> getAll() {
        return this.con;
    }

    @Override
    public Country create(Country country) {
        this.con.add(country);
        return country;

    }

    @Override
    public Country update(Country country) {
        if(!country.equals(null)) {
            return country;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Country read(Country country) {
        return country;
    }

}
