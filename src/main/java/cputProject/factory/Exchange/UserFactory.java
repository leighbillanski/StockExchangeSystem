package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Person;
import cputProject.domain.Exchange.User;

public class UserFactory {
    public static User getUser(String name, String sname){
        return new User.Builder().fName(name)
                .lName(sname)
                .build();
    }
}
