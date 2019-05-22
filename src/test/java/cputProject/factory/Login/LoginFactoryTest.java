package cputProject.factory.Login;

import cputProject.domain.Login.Login;
import cputProject.domain.Login.UserName;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginFactoryTest {

    @Test
    public void getPassword() {
        UserName str = UserNameFactory.getUserName("bLAJKH");
        Login password = LoginFactory.getLogin(str);
        assertNotNull(password.getLogin());
    }
}