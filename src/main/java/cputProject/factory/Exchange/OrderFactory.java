package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Order;
import cputProject.util.Misc;

public class OrderFactory {
    public static Order getOrder(String order){
        return  new Order.Builder().order(order).id(Misc.generateId())
                .build();
    }
}
