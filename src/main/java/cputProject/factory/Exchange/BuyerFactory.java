package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Buyer;

public class BuyerFactory {
    public static Buyer getBuyer(String name,String sname){
        return  new Buyer.Builder().fName(name)
                .lName(sname)
                .build();
    }
}
