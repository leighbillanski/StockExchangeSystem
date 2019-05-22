package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Person;
import cputProject.domain.Exchange.User;
import cputProject.util.Misc;

public class UserFactory {
    public static User getUser(String name, String sname){
        return new User.Builder().fName(name).id(Misc.generateId())
                .lName(sname)
                .build();
    }
}
