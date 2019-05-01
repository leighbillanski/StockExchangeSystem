package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Bonds;

import java.util.List;
import java.util.Set;

public interface BondsRepository extends Repository<Bonds, String> {
    Set<Bonds> getAll();
}
