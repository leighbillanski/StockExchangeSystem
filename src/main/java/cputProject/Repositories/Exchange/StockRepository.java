package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Stock;

import java.util.Set;

public interface StockRepository extends Repository<Stock, String> {
    Set<Stock> getAll();
}
