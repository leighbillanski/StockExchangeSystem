package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockAvailableRepository;
import cputProject.domain.Exchange.Stock;
import cputProject.domain.Exchange.StockAvailable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorysta")
public class StockAvailableRepositoryImp implements StockAvailableRepository {
    private static StockAvailableRepositoryImp repo = null;
    private Map<String,StockAvailable> comp;

    private StockAvailableRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static StockAvailableRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockAvailableRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<StockAvailable> getAll() {
        Collection<StockAvailable> students = this.comp.values();
        Set<StockAvailable> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public StockAvailable create(StockAvailable company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public StockAvailable update(StockAvailable company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public StockAvailable read(String company) {
        return this.comp.get(company);
    }
}
