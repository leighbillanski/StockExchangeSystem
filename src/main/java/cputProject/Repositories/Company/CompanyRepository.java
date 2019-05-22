package cputProject.Repositories.Company;

import cputProject.Repositories.Repository;
import cputProject.domain.Company.Company;

import java.util.Set;

public interface CompanyRepository extends Repository<Company, String> {
    Set<Company> getAll();
}
