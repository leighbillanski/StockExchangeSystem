package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Transaction;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionFactoryTest {

    @Test
    public void getTransavtion() {
        String str = "jhguyf";
        Transaction password = TransactionFactory.getTransavtion(str);
        assertNotNull(password.getDesc());
    }
}