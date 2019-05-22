package cputProject.service.Company;

import cputProject.domain.Company.Company;
import cputProject.service.Service;


import java.util.Set;

public interface CompanyService extends Service<Company,String> {
    Set<Company> getAll();
}
