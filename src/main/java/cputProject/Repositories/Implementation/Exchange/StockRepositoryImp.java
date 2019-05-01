package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockRepository;
import cputProject.domain.Exchange.Stock;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StockRepositoryImp implements StockRepository {
    private static StockRepositoryImp repo = null;
    private Set<Stock> comp;

    private StockRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static StockRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Stock> getAll() {
        return this.comp;
    }

    @Override
    public Stock create(Stock company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Stock update(Stock company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Stock> it = comp.iterator(); it.hasNext(); ){
            Stock c = it.next();
            if (c.equals(new Stock.Builder().stockId(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Stock read(Stock company) {
        return company;
    }
}
