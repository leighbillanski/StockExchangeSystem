package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.StockAvailable;

import java.util.List;
import java.util.Set;

public interface StockAvailableRepository extends Repository<StockAvailable, String> {
    Set<StockAvailable> getAll();
}
