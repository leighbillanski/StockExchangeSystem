package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockAvailableRepository;
import cputProject.domain.Exchange.Stock;
import cputProject.domain.Exchange.StockAvailable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StockAvailableRepositoryImp implements StockAvailableRepository {
    private static StockAvailableRepositoryImp repo = null;
    private List<StockAvailable> comp;

    private StockAvailableRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static StockAvailableRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockAvailableRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<StockAvailable> getAll() {
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

    }

    @Override
    public StockAvailable read(StockAvailable company) {
        return company;
    }
}
