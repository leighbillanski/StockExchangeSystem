package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockSold;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockSoldFactoryTest {

    @Test
    public void getLogin() {
        double str = 150;
        StockSold password = StockSoldFactory.getLogin(str);
        assertNotNull(password.getStock());
    }
}