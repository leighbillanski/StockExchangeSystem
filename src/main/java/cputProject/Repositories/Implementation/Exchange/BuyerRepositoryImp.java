package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.BuyerRepository;
import cputProject.domain.Exchange.Buyer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BuyerRepositoryImp implements BuyerRepository {
    private static BuyerRepositoryImp repo = null;
    private Set<Buyer> comp;

    private BuyerRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static BuyerRepositoryImp getRepo(){
        if(repo == null){
            repo = new BuyerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Buyer> getAll() {
        return this.comp;
    }

    @Override
    public Buyer create(Buyer company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Buyer update(Buyer company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Buyer> it = comp.iterator(); it.hasNext(); ){
            Buyer c = it.next();
            if (c.equals(new Buyer.Builder().fName(s)) || c.equals(new Buyer.Builder().lName(s))){
                this.comp.remove(c);
            }
        }

    }

    @Override
    public Buyer read(Buyer company) {
        return company;
    }
}
