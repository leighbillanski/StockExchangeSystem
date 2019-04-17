package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Order;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFactoryTest {

    @Test
    public void getOrder() {
        String str = "gchgchc";
        Order password = OrderFactory.getOrder(str);
        assertNotNull(password.getOrder());
    }
}