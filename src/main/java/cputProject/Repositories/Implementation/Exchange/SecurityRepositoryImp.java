package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SecurityRepository;
import cputProject.domain.Exchange.Security;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecurityRepositoryImp implements SecurityRepository {
    private static SecurityRepositoryImp repo = null;
    private List<Security> comp;

    private SecurityRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static SecurityRepositoryImp getRepo(){
        if(repo == null){
            repo = new SecurityRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Security> getAll() {
        return this.comp;
    }

    @Override
    public Security create(Security company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Security update(Security company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Security read(Security company) {
        return company;
    }
}
