package cputProject.factory.Login;

import cputProject.domain.Login.Email;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailFactoryTest {

    @Test
    public void getEmail() {
        String emailA = "216194806@mycput.ac.za";
        Email email = EmailFactory.getEmail(emailA);
        assertNotNull(email.getEmailAddres());
    }
}