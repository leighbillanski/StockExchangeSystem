package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockSold;
import cputProject.util.Misc;

public class StockSoldFactory {
    public static StockSold getLogin(double s){
        return  new StockSold.Builder().stock(s).id(Misc.generateId())
                .build();
    }
}
