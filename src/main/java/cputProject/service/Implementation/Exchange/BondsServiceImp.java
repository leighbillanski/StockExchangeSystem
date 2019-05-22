package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.BondsRepository;
import cputProject.domain.Exchange.Bonds;
import cputProject.service.Exchange.BondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplbo")
public class BondsServiceImp implements BondsService {
    @Autowired
    @Qualifier("InMemorybo")
    private BondsRepository repository;
    @Override
    public Set<Bonds> getAll() {
        return repository.getAll();
    }

    @Override
    public Bonds create(Bonds o) {
        return repository.create(o);
    }

    @Override
    public Bonds read(String  o) {
        return repository.read(o);
    }

    @Override
    public Bonds update(Bonds o) {
        return repository.update(o);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}
