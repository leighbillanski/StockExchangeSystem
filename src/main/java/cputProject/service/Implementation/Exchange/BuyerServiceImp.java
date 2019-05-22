package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.BuyerRepository;
import cputProject.domain.Exchange.Buyer;
import cputProject.service.Exchange.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplbu")
public class BuyerServiceImp implements BuyerService {
    @Autowired
    @Qualifier("InMemorybu")
    private BuyerRepository repository;
    @Override
    public Set<Buyer> getAll() {
        return repository.getAll();
    }

    @Override
    public Buyer create(Buyer buyer) {
        return repository.create(buyer);
    }

    @Override
    public Buyer read(String buyer) {
        return repository.read(buyer);
    }

    @Override
    public Buyer update(Buyer buyer) {
        return repository.update(buyer);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
