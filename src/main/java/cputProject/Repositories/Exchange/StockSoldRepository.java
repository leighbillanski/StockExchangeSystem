package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.StockSold;

import java.util.List;
import java.util.Set;

public interface StockSoldRepository extends Repository<StockSold, String> {
    List<StockSold> getAll();
}
