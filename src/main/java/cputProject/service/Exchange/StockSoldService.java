package cputProject.service.Exchange;

import cputProject.domain.Exchange.StockSold;
import cputProject.service.Service;

import java.util.Set;

public interface StockSoldService extends Service<StockSold,String> {
    Set<StockSold> getAll();
}
