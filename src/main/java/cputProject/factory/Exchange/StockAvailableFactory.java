package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockAvailable;
import cputProject.util.Misc;

public class StockAvailableFactory {
    public static StockAvailable getAvailable(double s){
        return  new StockAvailable.Builder().stock(s).id(Misc.generateId())
                .build();
    }
}
