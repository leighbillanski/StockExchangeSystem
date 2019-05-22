package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.BrokerRepository;
import cputProject.domain.Exchange.Broker;
import cputProject.service.Exchange.BrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplbr")
public class BrockerServiceImp implements BrokerService {
    @Autowired
    @Qualifier("InMemorybr")
    private BrokerRepository repository;
    @Override
    public Set<Broker> getAll() {
        return repository.getAll();
    }

    @Override
    public Broker create(Broker broker) {
        return repository.create(broker);
    }

    @Override
    public Broker read(String broker) {
        return repository.read(broker);
    }

    @Override
    public Broker update(Broker broker) {
        return repository.update(broker);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
