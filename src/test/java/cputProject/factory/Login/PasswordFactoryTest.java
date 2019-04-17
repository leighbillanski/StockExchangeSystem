package cputProject.factory.Login;

import cputProject.domain.Login.Password;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordFactoryTest {

    @Test
    public void getPassword() {
        String str = "walalwlakal";
        Password password = PasswordFactory.getPassword(str);
        assertNotNull(password.getPassword());
    }

}