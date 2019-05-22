package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockPriceRepository;
import cputProject.domain.Exchange.StockPrice;
import cputProject.service.Exchange.StockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplstp")
public class StockPriceServiceImp implements StockPriceService {
    @Autowired
    @Qualifier("InMemorystp")

    private StockPriceRepository repository;
    @Override
    public Set<StockPrice> getAll() {
        return repository.getAll();
    }

    @Override
    public StockPrice create(StockPrice stockPrice) {
        return repository.create(stockPrice);
    }

    @Override
    public StockPrice read(String stockPrice) {
        return repository.read(stockPrice);
    }

    @Override
    public StockPrice update(StockPrice stockPrice) {
        return repository.update(stockPrice);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
