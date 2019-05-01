package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockPriceRepository;
import cputProject.domain.Exchange.StockPrice;

import java.util.*;

public class StockPriceRepositoryImp implements StockPriceRepository {
    private static StockPriceRepositoryImp repo = null;
    private Set<StockPrice> comp;

    private StockPriceRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static StockPriceRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockPriceRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<StockPrice> getAll() {
        return this.comp;
    }

    @Override
    public StockPrice create(StockPrice company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public StockPrice update(StockPrice company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<StockPrice> it = comp.iterator(); it.hasNext(); ){
            StockPrice c = it.next();
            if (c.equals(new StockPrice.Builder().price(Double.parseDouble(s)))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public StockPrice read(StockPrice company) {
        return company;
    }
}
