package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.OrderRepository;
import cputProject.domain.Exchange.Order;
import cputProject.service.Exchange.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplo")
public class OrderServiceImp implements OrderService {
    @Autowired
    @Qualifier("InMemoryo")
    private OrderRepository repository;
    @Override
    public Set<Order> getAll() {
        return repository.getAll();
    }

    @Override
    public Order create(Order order) {
        return repository.create(order);
    }

    @Override
    public Order read(String order) {
        return repository.read(order);
    }

    @Override
    public Order update(Order order) {
        return repository.update(order);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
