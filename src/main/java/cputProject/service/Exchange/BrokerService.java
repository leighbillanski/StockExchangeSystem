package cputProject.service.Exchange;

import cputProject.domain.Exchange.Broker;
import cputProject.service.Service;

import java.util.Set;

public interface BrokerService extends Service<Broker,String> {
    Set<Broker> getAll();
}
