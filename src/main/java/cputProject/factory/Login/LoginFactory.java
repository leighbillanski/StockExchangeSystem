package cputProject.factory.Login;

import cputProject.domain.Login.Login;
import cputProject.domain.Login.UserName;
import cputProject.util.Misc;

public class LoginFactory {
    public static Login getLogin(UserName login){
        return  new Login.Builder().login(login).id(Misc.generateId())
                .build();
    }
}
