package cputProject.Repositories.Company;

import cputProject.Repositories.Repository;
import cputProject.domain.Company.Product;

import java.util.Set;

public interface ProductRepository extends Repository<Product, String> {
    Set<Product> getAll();
}
