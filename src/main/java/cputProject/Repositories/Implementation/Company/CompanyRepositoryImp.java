package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.CompanyRepository;
import cputProject.domain.Company.Company;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemory")
public class CompanyRepositoryImp implements CompanyRepository {

    private static CompanyRepositoryImp repo = null;
    private Map<String,Company> comp;

    private CompanyRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static CompanyRepositoryImp getRepo(){
        if(repo == null){
            repo = new CompanyRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Company> getAll() {
        Collection<Company> students = this.comp.values();
        Set<Company> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Company create(Company company) {
        this.comp.put(company.getCompanyId(),company);
        return company;
    }

    @Override
    public Company update(Company company) {
        this.comp.replace(company.getCompanyId(),company);
        return this.comp.get(company.getCompanyId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Company read(String company) {
        return this.comp.get(company);
    }


}
