package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockRepository;
import cputProject.domain.Exchange.Stock;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryst")
public class StockRepositoryImp implements StockRepository {
    private static StockRepositoryImp repo = null;
    private Map<String,Stock> comp;

    private StockRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static StockRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Stock> getAll() {
        Collection<Stock> students = this.comp.values();
        Set<Stock> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Stock create(Stock company) {
        this.comp.put(company.getStockId(),company);
        return company;
    }

    @Override
    public Stock update(Stock company) {
        this.comp.replace(company.getStockId(),company);
        return this.comp.get(company.getStockId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Stock read(String company) {
        return this.comp.get(company);
    }
}
