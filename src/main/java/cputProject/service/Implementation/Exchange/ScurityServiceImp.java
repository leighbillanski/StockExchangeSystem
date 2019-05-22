package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.SecurityRepository;
import cputProject.domain.Exchange.Security;
import cputProject.service.Exchange.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplsec")
public class ScurityServiceImp implements SecurityService {
    @Autowired
    @Qualifier("InMemorysec")
    private SecurityRepository repository;
    @Override
    public Set<Security> getAll() {
        return repository.getAll();
    }

    @Override
    public Security create(Security security) {
        return repository.create(security);
    }

    @Override
    public Security read(String security) {
        return repository.read(security);
    }

    @Override
    public Security update(Security security) {
        return repository.update(security);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
