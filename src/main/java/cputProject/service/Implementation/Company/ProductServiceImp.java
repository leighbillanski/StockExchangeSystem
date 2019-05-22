package cputProject.service.Implementation.Company;

import cputProject.Repositories.Company.ProductRepository;
import cputProject.domain.Company.Product;
import cputProject.service.Company.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplp")
public class ProductServiceImp implements ProductService {
    @Autowired
    @Qualifier("InMemoryp")
    private ProductRepository repository;
    @Override
    public Set<Product> getAll() {
        return repository.getAll();
    }

    @Override
    public Product create(Product product) {
        return repository.create(product);
    }

    @Override
    public Product read(String product) {
        return repository.read(product);
    }

    @Override
    public Product update(Product product) {
        return repository.update(product);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}
