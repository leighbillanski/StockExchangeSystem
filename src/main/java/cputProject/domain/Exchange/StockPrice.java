package cputProject.domain.Exchange;

public class StockPrice {

    private double price;
    private String id;

    private StockPrice(){}

    private StockPrice(Builder builder){
        this.id = builder.id;
        this.price = builder.price;
    }

    public String getId(){return id;}

    public double getPrice(){
        return price;
    }

    public static class Builder{

        private double price;
        private String id;

        public Builder price(double price){
            this.price = price;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public StockPrice build(){return new StockPrice(this);}
    }

}
