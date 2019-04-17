package cputProject.factory.Company;

import cputProject.domain.Company.Industry;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndustryFactoryTest {

    @Test
    public void getIndustry() {
        String type = "IT";
        Industry industry = IndustryFactory.getIndustry(type);
        assertNotNull(industry.getType());
    }
}