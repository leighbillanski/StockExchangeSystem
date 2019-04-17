package cputProject.factory.Login;

import cputProject.domain.Login.UserValidation;

public class UserValidationFactory {
    public static UserValidation getValidation(String mess){
        return  new UserValidation.Builder().message(mess)
                .build();
    }
}
