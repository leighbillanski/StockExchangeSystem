package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Broker;
import cputProject.util.Misc;

public class BrokerFactory {
    public static Broker getBroker(String name,String sname){
        return  new Broker.Builder().lName(name).id(Misc.generateId())
                .lName(sname)
                .build();
    }
}
