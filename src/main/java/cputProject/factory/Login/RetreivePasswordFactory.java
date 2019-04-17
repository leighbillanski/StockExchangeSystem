package cputProject.factory.Login;

import cputProject.domain.Login.RetreivePassword;

public class RetreivePasswordFactory {
    public static RetreivePassword getPassword(String old,String new1){
        return  new RetreivePassword.Builder().oldPassword(old)
                .newPassword(new1)
                .build();
    }
}
