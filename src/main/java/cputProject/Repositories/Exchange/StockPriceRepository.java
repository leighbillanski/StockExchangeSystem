package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.StockPrice;

import java.util.List;

public interface StockPriceRepository extends Repository<StockPrice, String> {
    List<StockPrice> getAll();
}
