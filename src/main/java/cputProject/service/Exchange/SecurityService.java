package cputProject.service.Exchange;

import cputProject.domain.Exchange.Security;
import cputProject.service.Service;

import java.util.Set;

public interface SecurityService extends Service<Security,String> {
    Set<Security> getAll();
}
