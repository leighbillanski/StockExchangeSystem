package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockAvailableRepository;
import cputProject.domain.Exchange.Stock;
import cputProject.domain.Exchange.StockAvailable;

import java.util.*;

public class StockAvailableRepositoryImp implements StockAvailableRepository {
    private static StockAvailableRepositoryImp repo = null;
    private Set<StockAvailable> comp;

    private StockAvailableRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static StockAvailableRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockAvailableRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<StockAvailable> getAll() {
        return this.comp;
    }

    @Override
    public StockAvailable create(StockAvailable company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public StockAvailable update(StockAvailable company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<StockAvailable> it = comp.iterator(); it.hasNext(); ){
            StockAvailable c = it.next();
            if (c.equals(new StockAvailable.Builder().stock(Double.parseDouble(s)))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public StockAvailable read(StockAvailable company) {
        return company;
    }
}
