package cputProject.factory.Exchange;

import cputProject.domain.Company.Company;
import cputProject.domain.Exchange.Stock;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockFactoryTest {

    @Test
    public void getStock() {
        Company comp = new Company();
        Stock password = StockFactory.getStock(comp);
        assertNotNull(password.getCompany());
    }
}