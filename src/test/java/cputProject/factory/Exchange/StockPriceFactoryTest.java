package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockPrice;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockPriceFactoryTest {

    @Test
    public void getLogin() {
        double str = 150;
        StockPrice password = StockPriceFactory.getPrice(str);
        assertNotNull(password.getPrice());
    }
}