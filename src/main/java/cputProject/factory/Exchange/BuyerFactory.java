package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Buyer;
import cputProject.util.Misc;

public class BuyerFactory {
    public static Buyer getBuyer(String name,String sname){
        return  new Buyer.Builder().fName(name).id(Misc.generateId())
                .lName(sname)
                .build();
    }
}
