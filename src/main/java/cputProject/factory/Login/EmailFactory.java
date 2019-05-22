package cputProject.factory.Login;

import cputProject.domain.Login.Email;
import cputProject.util.Misc;

public class EmailFactory{
    public static Email getEmail(String email){
        return new Email.Builder().emailAddres(email).id(Misc.generateId())
                .build();
    }
}
