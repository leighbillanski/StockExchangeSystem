package cputProject.service.Exchange;

import cputProject.domain.Exchange.Bonds;
import cputProject.domain.Exchange.Order;
import cputProject.service.Service;

import java.util.Set;

public interface OrderService extends Service<Order,String> {
    Set<Order> getAll();
}
