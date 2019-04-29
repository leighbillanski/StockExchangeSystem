package cputProject.Repositories.Implementation.Company;

import cputProject.Repositories.Company.ProductRepository;
import cputProject.domain.Company.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductRepositoryImp implements ProductRepository {
    private static ProductRepositoryImp repo = null;
    private Set<Product> comp;

    private ProductRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static ProductRepositoryImp getRepo(){
        if(repo == null){
            repo = new ProductRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Product> getAll() {
        return this.comp;
    }

    @Override
    public Product create(Product company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Product update(Product company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Product read(Product company) {
        return company;
    }
}
