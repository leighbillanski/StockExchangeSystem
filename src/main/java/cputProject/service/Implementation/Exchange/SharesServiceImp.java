package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.SharesRepository;
import cputProject.domain.Exchange.Shares;
import cputProject.service.Exchange.SharesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplsh")
public class SharesServiceImp implements SharesService {
    @Autowired
    @Qualifier("InMemorysh")
    private SharesRepository repository;
    @Override
    public Set<Shares> getAll() {
        return repository.getAll();
    }

    @Override
    public Shares create(Shares shares) {
        return repository.create(shares);
    }

    @Override
    public Shares read(String shares) {
        return repository.read(shares);
    }

    @Override
    public Shares update(Shares shares) {
        return repository.update(shares);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
