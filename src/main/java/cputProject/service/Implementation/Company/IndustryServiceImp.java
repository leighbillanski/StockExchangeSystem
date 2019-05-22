package cputProject.service.Implementation.Company;

import cputProject.Repositories.Company.IndustryRepository;
import cputProject.domain.Company.Industry;
import cputProject.service.Company.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImpli")
public class IndustryServiceImp implements IndustryService {
    @Autowired
    @Qualifier("InMemoryi")
    private IndustryRepository repository;
    @Override
    public Set<Industry> getAll() {
        return repository.getAll();
    }

    @Override
    public Industry create(Industry industry) {
        return repository.create(industry);
    }

    @Override
    public Industry read(String industry) {
        return repository.read(industry);
    }

    @Override
    public Industry update(Industry industry) {
        return repository.update(industry);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}
