package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Shares;

import java.util.List;
import java.util.Set;

public interface SharesRepository extends Repository<Shares, String> {
    List<Shares> getAll();
}
