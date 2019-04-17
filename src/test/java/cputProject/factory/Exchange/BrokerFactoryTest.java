package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Broker;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrokerFactoryTest {

    @Test
    public void getBroker() {
        String str = "Kaylynn",str1="Johnson";
        Broker user = BrokerFactory.getBroker(str,str1);
        assertNotNull(user.getfName(),user.getlName());
    }
}