package cputProject.factory.Login;

import cputProject.domain.Login.Register;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterFactoryTest {

    @Test
    public void getRegister() {
        String str = "walalwlakal",str1="321546546",str2="5416354dfcsd";
        Register password = RegisterFactory.getRegister(str,str1,str2);
        assertNotNull(password.getPassword(),password.getEmail());
    }
}