package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.OrderRepository;
import cputProject.domain.Exchange.Order;

import java.util.*;

public class OrderRepositoryImp implements OrderRepository {
    private static OrderRepositoryImp repo = null;
    private Set<Order> comp;

    private OrderRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static OrderRepositoryImp getRepo(){
        if(repo == null){
            repo = new OrderRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Order> getAll() {
        return this.comp;
    }

    @Override
    public Order create(Order company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Order update(Order company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        for(Iterator<Order> it = comp.iterator(); it.hasNext(); ){
            Order c = it.next();
            if (c.equals(new Order.Builder().order(s))){
                this.comp.remove(c);
            }
        }

    }

    @Override
    public Order read(Order company) {
        return company;
    }
}
