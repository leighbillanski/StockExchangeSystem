package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.OrderRepository;
import cputProject.domain.Exchange.Order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderRepositoryImp implements OrderRepository {
    private static OrderRepositoryImp repo = null;
    private List<Order> comp;

    private OrderRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static OrderRepositoryImp getRepo(){
        if(repo == null){
            repo = new OrderRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Order> getAll() {
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

    }

    @Override
    public Order read(Order company) {
        return company;
    }
}
