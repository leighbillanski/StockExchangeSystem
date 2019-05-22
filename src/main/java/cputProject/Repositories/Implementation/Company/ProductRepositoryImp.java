package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.ProductRepository;
import cputProject.domain.Company.Product;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryp")
public class ProductRepositoryImp implements ProductRepository {
    private static ProductRepositoryImp repo = null;
    private Map<String,Product> comp;

    private ProductRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static ProductRepositoryImp getRepo(){
        if(repo == null){
            repo = new ProductRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Product> getAll() {
        Collection<Product> students = this.comp.values();
        Set<Product> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Product create(Product company) {
        this.comp.put(company.getProductId(),company);
        return company;
    }

    @Override
    public Product update(Product company) {
        this.comp.replace(company.getProductId(),company);
        return this.comp.get(company.getProductId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Product read(String company) {
        return this.comp.get(company);
    }
}
