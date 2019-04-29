package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Broker;

import java.util.Set;

public interface BrokerRepository extends Repository<Broker, String> {
    Set<Broker> getAll();
}
