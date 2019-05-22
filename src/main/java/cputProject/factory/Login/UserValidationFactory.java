package cputProject.factory.Login;

import cputProject.domain.Login.UserValidation;
import cputProject.util.Misc;

public class UserValidationFactory {
    public static UserValidation getValidation(String mess){
        return  new UserValidation.Builder().message(mess).id(Misc.generateId())
                .build();
    }
}
