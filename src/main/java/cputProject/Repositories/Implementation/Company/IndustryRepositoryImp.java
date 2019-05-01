package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.IndustryRepository;
import cputProject.domain.Company.Industry;

import java.util.*;

public class IndustryRepositoryImp implements IndustryRepository {
    private static IndustryRepositoryImp repo = null;
    private Set<Industry> comp;

    private IndustryRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static IndustryRepositoryImp getRepo(){
        if(repo == null){
            repo = new IndustryRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Industry> getAll() {
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
        for(Iterator<Industry> it = comp.iterator(); it.hasNext(); ){
            Industry c = it.next();
            if (c.equals(new Industry.Builder().type(s))){
                this.comp.remove(c);
            }
        }

    }

    @Override
    public Industry read(Industry company) {
        return company;
    }
}
