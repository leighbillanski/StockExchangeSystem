package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Security;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecurityFactoryTest {

    @Test
    public void getSecurity() {
        String str = "hfxcgfx";
        Security password = SecurityFactory.getSecurity(str);
        assertNotNull(password.getSec());
    }
}