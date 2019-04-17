package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockSold;

public class StockSoldFactory {
    public static StockSold getLogin(double s){
        return  new StockSold.Builder().stock(s)
                .build();
    }
}
