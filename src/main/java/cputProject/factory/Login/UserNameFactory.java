package cputProject.factory.Login;

import cputProject.domain.Login.UserName;
import cputProject.util.Misc;

public class UserNameFactory {

    public static UserName getUserName( String name){
        return new UserName.Builder().userId(Misc.generateId())
                .userName(name)
                .build();
    }
}
