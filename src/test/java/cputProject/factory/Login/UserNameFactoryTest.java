package cputProject.factory.Login;

import cputProject.domain.Login.UserName;
import cputProject.factory.Exchange.UserFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserNameFactoryTest {

    @Test
    public void getUserName() {
        String str = "leighBiliianski";
        UserName password = UserNameFactory.getUserName(str);
        assertNotNull(password.getUserName());
    }
}