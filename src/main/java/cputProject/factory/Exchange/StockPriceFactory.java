package cputProject.factory.Exchange;

import cputProject.domain.Exchange.StockPrice;

public class StockPriceFactory {
    public static StockPrice getPrice(double price){
        return  new StockPrice.Builder().price(price)
                .build();
    }
}
