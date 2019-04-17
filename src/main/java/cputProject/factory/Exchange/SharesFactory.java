package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Shares;

public class SharesFactory {
    public static Shares getShares(double s){
        return  new Shares.Builder().order(s)
                .build();
    }
}
