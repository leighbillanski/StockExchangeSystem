package cputProject.Repositories.Company;

import cputProject.Repositories.Repository;
import cputProject.domain.Company.Industry;

import java.util.List;
import java.util.Set;

public interface IndustryRepository extends Repository<Industry, String> {
    Set<Industry> getAll();
}
