package cputProject.service.Company;

import cputProject.domain.Company.Product;
import cputProject.service.Service;

import java.util.Set;

public interface ProductService extends Service<Product,String> {
    Set<Product> getAll();
}
