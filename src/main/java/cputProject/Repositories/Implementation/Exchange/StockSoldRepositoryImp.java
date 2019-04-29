package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockSoldRepository;
import cputProject.domain.Exchange.StockSold;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StockSoldRepositoryImp implements StockSoldRepository {
    private static StockSoldRepositoryImp repo = null;
    private List<StockSold> comp;

    private StockSoldRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static StockSoldRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockSoldRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<StockSold> getAll() {
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

    }

    @Override
    public StockSold read(StockSold company) {
        return company;
    }
}
