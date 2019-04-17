package cputProject.factory.Company;


import cputProject.domain.Company.Industry;

public class IndustryFactory {

    public static Industry getIndustry(String type){

        return new Industry.Builder().type(type)
                .build();
    }
}
