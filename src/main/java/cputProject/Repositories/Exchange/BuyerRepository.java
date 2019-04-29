package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Buyer;

import java.util.Set;

public interface BuyerRepository extends Repository<Buyer, String> {
    Set<Buyer> getAll();
}
