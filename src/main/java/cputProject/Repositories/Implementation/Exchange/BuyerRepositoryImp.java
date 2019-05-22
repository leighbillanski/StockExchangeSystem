package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BuyerRepository;
import cputProject.domain.Exchange.Buyer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorybu")
public class BuyerRepositoryImp implements BuyerRepository {
    private static BuyerRepositoryImp repo = null;
    private Map<String,Buyer> comp;

    private BuyerRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static BuyerRepositoryImp getRepo(){
        if(repo == null){
            repo = new BuyerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Buyer> getAll() {
        Collection<Buyer> students = this.comp.values();
        Set<Buyer> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Buyer create(Buyer company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Buyer update(Buyer company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Buyer read(String company) {
        return this.comp.get(company);
    }
}
