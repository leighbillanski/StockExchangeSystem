package cputProject.service.Implementation.Company;

import cputProject.Repositories.Company.CompanyRepository;
import cputProject.domain.Company.Company;
import cputProject.service.Company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@Service("ServiceImpl")
public class CompanyServiceImp implements CompanyService {
    @Autowired
    @Qualifier("InMemory")
    private CompanyRepository repository;

    @Override
    public Set<Company> getAll() {
        return repository.getAll();
    }

    @Override
    public Company create(Company o) {
        return repository.create(o);
    }

    @Override
    public Company read(String o) {
        return repository.read(o);
    }

    @Override
    public Company update(Company o) {
        return repository.update(o);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}
