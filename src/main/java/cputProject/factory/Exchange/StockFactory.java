package cputProject.factory.Exchange;


import cputProject.domain.Company.Company;
import cputProject.domain.Exchange.Stock;
import cputProject.util.Misc;

public class StockFactory {

    public static Stock getStock(Company comp){
        return  new Stock.Builder().stockId(Misc.generateId())
                .company(comp)
                .build();
    }
}
