package cputProject.service.Exchange;

import cputProject.domain.Exchange.Buyer;
import cputProject.service.Service;

import java.util.Set;

public interface BuyerService extends Service<Buyer,String> {
    Set<Buyer> getAll();
}
