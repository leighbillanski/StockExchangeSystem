package cputProject.factory.Login;

import cputProject.domain.Login.Register;

public class RegisterFactory {
    public static Register getRegister(String email,String userName,String password){
        return  new Register.Builder().password(password)
                .email(email)
                .userName(userName)
                .build();
    }
}
