package cputProject.domain.Exchange;

public class StockPrice {

    private double price;

    private StockPrice(){}

    private StockPrice(Builder builder){
        this.price = builder.price;
    }

    public double getPrice(){
        return price;
    }

    public static class Builder{

        private double price;

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public StockPrice build(){return new StockPrice(this);}
    }

}
