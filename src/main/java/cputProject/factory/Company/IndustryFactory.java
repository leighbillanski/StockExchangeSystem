package cputProject.factory.Company;


import cputProject.domain.Company.Industry;
import cputProject.util.Misc;

public class IndustryFactory {

    public static Industry getIndustry(String type){

        return new Industry.Builder().type(type).id(Misc.generateId())
                .build();
    }
}
