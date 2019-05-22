package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockSoldRepository;
import cputProject.domain.Exchange.StockSold;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorysts")
public class StockSoldRepositoryImp implements StockSoldRepository {
    private static StockSoldRepositoryImp repo = null;
    private Map<String,StockSold> comp;

    private StockSoldRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static StockSoldRepositoryImp getRepo(){
        if(repo == null){
            repo = new StockSoldRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<StockSold> getAll() {
        Collection<StockSold> students = this.comp.values();
        Set<StockSold> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public StockSold create(StockSold company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public StockSold update(StockSold company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public StockSold read(String company) {
        return this.comp.get(company);
    }
}
