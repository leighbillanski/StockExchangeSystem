package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Seller;

import java.util.Set;

public interface SellerRepository extends Repository<Seller, String> {
    Set<Seller> getAll();
}
