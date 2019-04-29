package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Order;

import java.util.List;
import java.util.Set;

public interface OrderRepository extends Repository<Order, String> {
    List<Order> getAll();
}
