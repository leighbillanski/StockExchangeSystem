package cputProject.factory.Login;

import cputProject.domain.Login.Password;
import cputProject.util.Misc;

public class PasswordFactory {
    public static Password getPassword(String password){
        return  new Password.Builder().password(password).id(Misc.generateId())
                .build();
    }
}
