package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Security;

import java.util.List;
import java.util.Set;

public interface SecurityRepository extends Repository<Security, String> {
    List<Security> getAll();
}
