package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Order;

public class OrderFactory {
    public static Order getOrder(String order){
        return  new Order.Builder().order(order)
                .build();
    }
}
