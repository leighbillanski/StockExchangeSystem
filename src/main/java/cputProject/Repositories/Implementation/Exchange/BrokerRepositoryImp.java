package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BrokerRepository;
import cputProject.domain.Exchange.Broker;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorybr")
public class BrokerRepositoryImp implements BrokerRepository {
    private static BrokerRepositoryImp repo = null;
    private Map<String,Broker> comp;

    private BrokerRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static BrokerRepositoryImp getRepo(){
        if(repo == null){
            repo = new BrokerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Broker> getAll() {
        Collection<Broker> students = this.comp.values();
        Set<Broker> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Broker create(Broker company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Broker update(Broker company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {

        this.comp.remove(s);
    }

    @Override
    public Broker read(String company) {
        return this.comp.get(company);
    }
}
