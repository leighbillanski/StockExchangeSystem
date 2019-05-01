package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SecurityRepository;
import cputProject.domain.Exchange.Security;

import java.util.*;

public class SecurityRepositoryImp implements SecurityRepository {
    private static SecurityRepositoryImp repo = null;
    private Set<Security> comp;

    private SecurityRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static SecurityRepositoryImp getRepo(){
        if(repo == null){
            repo = new SecurityRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Security> getAll() {
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
        for(Iterator<Security> it = comp.iterator(); it.hasNext(); ){
            Security c = it.next();
            if (c.equals(new Security.Builder().sec(s))){
                this.comp.remove(c);
            }
        }

    }

    @Override
    public Security read(Security company) {
        return company;
    }
}
