package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SecurityRepository;
import cputProject.domain.Exchange.Security;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorysec")
public class SecurityRepositoryImp implements SecurityRepository {
    private static SecurityRepositoryImp repo = null;
    private Map<String,Security> comp;

    private SecurityRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static SecurityRepositoryImp getRepo(){
        if(repo == null){
            repo = new SecurityRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Security> getAll() {
        Collection<Security> students = this.comp.values();
        Set<Security> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Security create(Security company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Security update(Security company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Security read(String company) {
        return this.comp.get(company);
    }
}
