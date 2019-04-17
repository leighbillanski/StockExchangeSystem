package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Shares;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharesFactoryTest {

    @Test
    public void getShares() {
        double str = 150;
        Shares password = SharesFactory.getShares(str);
        assertNotNull(password.getShare());
    }
}