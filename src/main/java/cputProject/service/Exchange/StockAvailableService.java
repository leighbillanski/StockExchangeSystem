package cputProject.service.Exchange;

import cputProject.domain.Exchange.StockAvailable;
import cputProject.service.Service;

import java.util.Set;

public interface StockAvailableService extends Service<StockAvailable,String> {
    Set<StockAvailable> getAll();
}
