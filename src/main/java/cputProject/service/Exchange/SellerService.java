package cputProject.service.Exchange;

import cputProject.domain.Exchange.Seller;
import cputProject.service.Service;

import java.util.Set;

public interface SellerService extends Service <Seller,String>{
    Set<Seller> getAll();
}
