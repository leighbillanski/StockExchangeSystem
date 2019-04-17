package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockAvailable;

public class StockAvailableFactory {
    public static StockAvailable getAvailable(double s){
        return  new StockAvailable.Builder().stock(s)
                .build();
    }
}
