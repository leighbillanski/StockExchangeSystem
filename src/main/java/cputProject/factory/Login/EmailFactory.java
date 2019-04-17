package cputProject.factory.Login;

import cputProject.domain.Login.Email;

public class EmailFactory{
    public static Email getEmail(String email){
        return new Email.Builder().emailAddres(email)
                .build();
    }
}
