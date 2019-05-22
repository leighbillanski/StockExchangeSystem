package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.StockAvailableRepository;
import cputProject.domain.Exchange.StockAvailable;
import cputProject.service.Exchange.StockAvailableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplsta")
public class StockAvailableServiceImp implements StockAvailableService {
    @Autowired
    @Qualifier("InMemorysta")
    private StockAvailableRepository repository;
    @Override
    public Set<StockAvailable> getAll() {
        return repository.getAll();
    }

    @Override
    public StockAvailable create(StockAvailable stockAvailable) {
        return repository.create(stockAvailable);
    }

    @Override
    public StockAvailable read(String stockAvailable) {
        return repository.read(stockAvailable);
    }

    @Override
    public StockAvailable update(StockAvailable stockAvailable) {
        return repository.update(stockAvailable);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
