package cputProject.factory.Login;

import cputProject.domain.Login.RetreivePassword;
import org.junit.Test;

import static org.junit.Assert.*;

public class RetreivePasswordFactoryTest {

    @Test
    public void getPassword() {
        String str = "123456895",str1="1255648568";
        RetreivePassword password = RetreivePasswordFactory.getPassword(str,str1);
        assertNotNull(password.getNewPassword(),password.getOldPassword());
    }
}