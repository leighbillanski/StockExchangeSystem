package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SellerRepository;
import cputProject.domain.Exchange.Seller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SellerRepositoryImp implements SellerRepository {
    private static SellerRepositoryImp repo = null;
    private Set<Seller> comp;

    private SellerRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static SellerRepositoryImp getRepo(){
        if(repo == null){
            repo = new SellerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Seller> getAll() {
        return this.comp;
    }

    @Override
    public Seller create(Seller company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Seller update(Seller company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Seller> it = comp.iterator(); it.hasNext(); ){
            Seller c = it.next();
            if (c.equals(new Seller.Builder().fName(s)) || c.equals(new Seller.Builder().lName(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Seller read(Seller company) {
        return company;
    }
}
