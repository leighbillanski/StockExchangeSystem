package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Broker;
import cputProject.domain.Exchange.Buyer;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuyerFactoryTest {

    @Test
    public void getBuyer() {
        String str = "Kaylynn",str1="Johnson";
        Buyer user = BuyerFactory.getBuyer(str,str1);
        assertNotNull(user.getfName(),user.getlName());
    }
}