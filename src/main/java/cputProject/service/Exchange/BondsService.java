package cputProject.service.Exchange;

import cputProject.domain.Exchange.Bonds;
import cputProject.service.Service;

import java.util.Set;

public interface BondsService extends Service<Bonds,String> {
    Set<Bonds> getAll();
}
