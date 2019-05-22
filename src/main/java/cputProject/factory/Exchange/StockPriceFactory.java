package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockPrice;
import cputProject.util.Misc;

public class StockPriceFactory {
    public static StockPrice getPrice(double price){
        return  new StockPrice.Builder().price(price).id(Misc.generateId())
                .build();
    }
}
