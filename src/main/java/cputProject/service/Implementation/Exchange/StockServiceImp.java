package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockRepository;
import cputProject.domain.Exchange.Stock;
import cputProject.service.Exchange.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplst")
public class StockServiceImp implements StockService {
    @Autowired
    @Qualifier("InMemoryst")
    private StockRepository repository;
    @Override
    public Set<Stock> getAll() {
        return repository.getAll();
    }

    @Override
    public Stock create(Stock stock) {
        return repository.create(stock);
    }

    @Override
    public Stock read(String stock) {
        return repository.read(stock);
    }

    @Override
    public Stock update(Stock stock) {
        return repository.update(stock);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
