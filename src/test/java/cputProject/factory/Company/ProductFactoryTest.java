package cputProject.factory.Company;

import cputProject.domain.Company.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductFactoryTest {

    @Test
    public void getProduct() {
        String name = "IT Services";
        Product product = ProductFactory.getProduct(name);
        assertNotNull(product.getProductName());
    }
}