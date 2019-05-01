package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockSoldRepository;
import cputProject.domain.Exchange.StockSold;

import java.util.*;

public class StockSoldRepositoryImp implements StockSoldRepository {
    private static StockSoldRepositoryImp repo = null;
    private Set<StockSold> comp;

    private StockSoldRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static StockSoldRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockSoldRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<StockSold> getAll() {
        return this.comp;
    }

    @Override
    public StockSold create(StockSold company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public StockSold update(StockSold company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<StockSold> it = comp.iterator(); it.hasNext(); ){
            StockSold c = it.next();
            if (c.equals(new StockSold.Builder().stock(Double.parseDouble(s)))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public StockSold read(StockSold company) {
        return company;
    }
}
