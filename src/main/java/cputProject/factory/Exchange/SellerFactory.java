package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Seller;

public class SellerFactory {
    public static Seller getSeller(String name, String sname){
        return  new Seller.Builder().fName(name)
                .lName(sname)
                .build();
    }
}
