package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Seller;
import cputProject.util.Misc;

public class SellerFactory {
    public static Seller getSeller(String name, String sname){
        return  new Seller.Builder().fName(name).id(Misc.generateId())
                .lName(sname)
                .build();
    }
}
