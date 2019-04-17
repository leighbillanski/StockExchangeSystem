package cputProject.factory.Login;

import cputProject.domain.Login.Password;

public class PasswordFactory {
    public static Password getPassword(String password){
        return  new Password.Builder().password(password)
                .build();
    }
}
