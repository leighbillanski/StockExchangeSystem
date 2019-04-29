package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BrokerRepository;
import cputProject.domain.Exchange.Broker;

import java.util.HashSet;
import java.util.Set;

public class BrokerRepositoryImp implements BrokerRepository {
    private static BrokerRepositoryImp repo = null;
    private Set<Broker> comp;

    private BrokerRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static BrokerRepositoryImp getRepo(){
        if(repo == null){
            repo = new BrokerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Broker> getAll() {
        return this.comp;
    }

    @Override
    public Broker create(Broker company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Broker update(Broker company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Broker read(Broker company) {
        return company;
    }
}
