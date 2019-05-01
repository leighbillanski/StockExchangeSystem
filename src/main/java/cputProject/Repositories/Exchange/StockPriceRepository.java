package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.StockPrice;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Set;

public interface StockPriceRepository extends Repository<StockPrice, String> {
    Set<StockPrice> getAll();
}
