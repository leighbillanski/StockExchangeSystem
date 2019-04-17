package cputProject.factory.Company;

import cputProject.domain.Company.Company;
import cputProject.domain.Company.Product;
import cputProject.util.Misc;

public class CompanyFactory {

    public static Company getCompany(String name) {
        return new Company.Builder().companyId(Misc.generateId())
                .name(name)
                .build();
    }
}
