package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Seller;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellerFactoryTest {

    @Test
    public void getSeller() {
        String str = "Kaylynn",str1="Johnson";
        Seller user = SellerFactory.getSeller(str,str1);
        assertNotNull(user.getfName(),user.getlName());
    }
}