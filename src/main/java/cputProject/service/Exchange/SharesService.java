package cputProject.service.Exchange;

import cputProject.domain.Exchange.Shares;
import cputProject.service.Service;

import java.util.Set;

public interface SharesService extends Service <Shares,String>{
    Set<Shares> getAll();
}
