package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SharesRepository;
import cputProject.domain.Exchange.Shares;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorysh")
public class SharesRepositoryImp implements SharesRepository {
    private static SharesRepositoryImp repo = null;
    private Map<String,Shares> comp;

    private SharesRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static SharesRepositoryImp getRepo(){
        if(repo == null){
            repo = new SharesRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Shares> getAll() {
        Collection<Shares> students = this.comp.values();
        Set<Shares> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Shares create(Shares company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Shares update(Shares company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Shares read(String company) {
        return this.comp.get(company);
    }
}
