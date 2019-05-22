package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Security;
import cputProject.util.Misc;

public class SecurityFactory {
    public static Security getSecurity(String sec){
        return  new Security.Builder().sec(sec).id(Misc.generateId())
                .build();
    }
}
