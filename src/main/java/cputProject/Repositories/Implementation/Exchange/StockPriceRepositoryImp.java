package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockPriceRepository;
import cputProject.domain.Exchange.StockPrice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorystp")
public class StockPriceRepositoryImp implements StockPriceRepository {
    private static StockPriceRepositoryImp repo = null;
    private Map<String,StockPrice> comp;

    private StockPriceRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static StockPriceRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockPriceRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<StockPrice> getAll() {
        Collection<StockPrice> students = this.comp.values();
        Set<StockPrice> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public StockPrice create(StockPrice company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public StockPrice update(StockPrice company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public StockPrice read(String company) {
        return this.comp.get(company);
    }
}
