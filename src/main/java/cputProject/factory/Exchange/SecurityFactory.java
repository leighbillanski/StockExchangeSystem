package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Security;

public class SecurityFactory {
    public static Security getSecurity(String sec){
        return  new Security.Builder().sec(sec)
                .build();
    }
}
