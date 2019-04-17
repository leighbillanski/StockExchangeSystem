package cputProject.factory.Login;

import cputProject.domain.Login.UserValidation;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserValidationFactoryTest {

    @Test
    public void getValidation() {
        String str = "walalwlakal";
        UserValidation password = UserValidationFactory.getValidation(str);
        assertNotNull(password.getMessage());
    }
}