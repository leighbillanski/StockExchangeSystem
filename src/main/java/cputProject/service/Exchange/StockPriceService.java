package cputProject.service.Exchange;

import cputProject.domain.Exchange.StockPrice;
import cputProject.service.Service;

import java.util.Set;

public interface StockPriceService extends Service<StockPrice,String> {
    Set<StockPrice> getAll();
}
