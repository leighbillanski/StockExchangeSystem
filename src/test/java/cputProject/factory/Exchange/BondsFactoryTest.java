package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Bonds;
import org.junit.Test;

import static org.junit.Assert.*;

public class BondsFactoryTest {

    @Test
    public void getBonds() {
        String str = "jbjmkbjm";
        Bonds password = BondsFactory.getBonds(str);
        assertNotNull(password.getBond());
    }
}