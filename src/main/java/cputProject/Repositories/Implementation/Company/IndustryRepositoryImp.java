package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.IndustryRepository;
import cputProject.domain.Company.Industry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndustryRepositoryImp implements IndustryRepository {
    private static IndustryRepositoryImp repo = null;
    private List<Industry> comp;

    private IndustryRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static IndustryRepositoryImp getRepo(){
        if(repo == null){
            repo = new IndustryRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Industry> getAll() {
        return this.comp;
    }

    @Override
    public Industry create(Industry company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Industry update(Industry company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Industry read(Industry company) {
        return company;
    }
}
