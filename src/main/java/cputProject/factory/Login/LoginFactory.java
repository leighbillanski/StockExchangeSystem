package cputProject.factory.Login;

import cputProject.domain.Login.Login;

public class LoginFactory {
    public static Login getLogin(String login){
        return  new Login.Builder().login(login)
                .build();
    }
}
