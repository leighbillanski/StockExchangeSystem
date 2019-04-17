package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Broker;

public class BrokerFactory {
    public static Broker getBroker(String name,String sname){
        return  new Broker.Builder().lName(name)
                .lName(sname)
                .build();
    }
}
