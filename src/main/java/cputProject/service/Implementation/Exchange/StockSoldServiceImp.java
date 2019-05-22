package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockSoldRepository;
import cputProject.domain.Exchange.StockSold;
import cputProject.service.Exchange.StockSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplsts")
public class StockSoldServiceImp implements StockSoldService {
    @Autowired
    @Qualifier("InMemorysts")
    private StockSoldRepository repository;
    @Override
    public Set<StockSold> getAll() {
        return repository.getAll();
    }

    @Override
    public StockSold create(StockSold stockSold) {
        return repository.create(stockSold);
    }

    @Override
    public StockSold read(String stockSold) {
        return repository.read(stockSold);
    }

    @Override
    public StockSold update(StockSold stockSold) {
        return repository.update(stockSold);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
