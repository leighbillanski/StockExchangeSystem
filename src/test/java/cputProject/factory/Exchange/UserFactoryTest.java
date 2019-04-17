package cputProject.factory.Exchange;

import cputProject.domain.Exchange.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void getUser() {
        String str = "Kaylynn",str1="Johnson";
        User user = UserFactory.getUser(str,str1);
        assertNotNull(user.getfName(),user.getlName());
    }
}