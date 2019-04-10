package cputProject.factory;

import cputProject.domain.Company;

public class CompanyFactory {

    public static Company getCompany(String name,String product) {
        return new Company.Builder().product(product)
                .name(name)
                .build();
    }
}
