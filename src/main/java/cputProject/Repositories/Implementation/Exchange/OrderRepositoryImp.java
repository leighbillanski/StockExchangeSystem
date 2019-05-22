package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.OrderRepository;
import cputProject.domain.Exchange.Order;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryo")
public class OrderRepositoryImp implements OrderRepository {
    private static OrderRepositoryImp repo = null;
    private Map<String,Order> comp;

    private OrderRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static OrderRepositoryImp getRepo(){
        if(repo == null){
            repo = new OrderRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Order> getAll() {
        Collection<Order> students = this.comp.values();
        Set<Order> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Order create(Order company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Order update(Order company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);
    }

    @Override
    public Order read(String company) {
        return this.comp.get(company);
    }
}
