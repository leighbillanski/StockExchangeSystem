package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.CompanyRepository;
import cputProject.domain.Company.Company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CompanyRepositoryImp implements CompanyRepository {

    private static CompanyRepositoryImp repo = null;
    private Set<Company> comp;

    private CompanyRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static CompanyRepositoryImp getRepo(){
        if(repo == null){
            repo = new CompanyRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Company> getAll() {
        return this.comp;
    }

    @Override
    public Company create(Company company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Company update(Company company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Company> it = comp.iterator(); it.hasNext(); ){
            Company c = it.next();
            if (c.equals(new Company.Builder().name(s))){
                this.comp.remove(c);
            }
        }
    }

    @Override
    public Company read(Company company) {
        return company;
    }
}
