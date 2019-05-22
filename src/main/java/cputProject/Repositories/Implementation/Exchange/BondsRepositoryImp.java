package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BondsRepository;
import cputProject.domain.Exchange.Bonds;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorybo")
public class BondsRepositoryImp implements BondsRepository {
    private static BondsRepositoryImp repo = null;
    private Map<String,Bonds> comp;

    private BondsRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static BondsRepositoryImp getRepo(){
        if(repo == null){
            repo = new BondsRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Bonds> getAll() {
        Collection<Bonds> students = this.comp.values();
        Set<Bonds> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Bonds create(Bonds company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Bonds update(Bonds company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Bonds read(String company) {
        return this.comp.get(company);
    }
}
