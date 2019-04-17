package cputProject.factory.Login;

import cputProject.domain.Login.Login;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginFactoryTest {

    @Test
    public void getPassword() {
        String str = "walalwlakal";
        Login password = LoginFactory.getLogin(str);
        assertNotNull(password.getLogin());
    }
}