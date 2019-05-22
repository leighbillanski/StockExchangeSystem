package cputProject.service.Company;

import cputProject.domain.Company.Industry;
import cputProject.service.Service;

import java.util.Set;

public interface IndustryService extends Service<Industry,String> {
    Set<Industry> getAll();
}
