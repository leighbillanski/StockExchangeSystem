package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockAvailable;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockAvailableFactoryTest {

    @Test
    public void getAvailable() {
        double str = 150;
        StockAvailable password = StockAvailableFactory.getAvailable(str);
        assertNotNull(password.getStock());
    }
}