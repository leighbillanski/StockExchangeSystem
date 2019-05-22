package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Shares;
import cputProject.util.Misc;

public class SharesFactory {
    public static Shares getShares(double s){
        return  new Shares.Builder().order(s).id(Misc.generateId())
                .build();
    }
}
