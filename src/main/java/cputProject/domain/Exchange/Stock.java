package cputProject.domain.Exchange;

import cputProject.domain.Company.Company;

public class Stock {

    private String stockId;
    private Company company;

    private Stock(){}

    private Stock(Builder builder){
        this.stockId = builder.stockId;
        this.company = builder.company;
    }

    public String getStockId(){return stockId;}
    public Company getCompany(){return company;}


    public static class Builder{

        private String stockId;
        private Company company;

        public Builder stockId(String stockId){
            this.stockId = stockId;
             return this;
        }

        public Builder company(Company company){
            this.company = company;
            return this;
        }
        public Stock build(){return new Stock(this);}

    }

}
