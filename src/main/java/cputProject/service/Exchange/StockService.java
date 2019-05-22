package cputProject.service.Exchange;

import cputProject.domain.Exchange.Stock;
import cputProject.domain.Exchange.StockSold;
import cputProject.service.Service;

import java.util.Set;

public interface StockService extends Service<Stock,String> {
    Set<Stock> getAll();
}
