package cputProject.factory.Company;

import cputProject.domain.Company.Product;
import cputProject.util.Misc;

public class ProductFactory {
    public static Product getProduct(String name) {
        return new Product.Builder().productId(Misc.generateId())
                .productName(name)
                .build();
    }
}
