package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockPriceRepository;
import cputProject.domain.Exchange.StockPrice;

import java.util.ArrayList;
import java.util.List;

public class StockPriceRepositoryImp implements StockPriceRepository {
    private static StockPriceRepositoryImp repo = null;
    private List<StockPrice> comp;

    private StockPriceRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static StockPriceRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockPriceRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<StockPrice> getAll() {
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

    }

    @Override
    public StockPrice read(StockPrice company) {
        return company;
    }
}
