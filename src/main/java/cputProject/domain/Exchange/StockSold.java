package cputProject.domain.Exchange;

public class StockSold {
    private double stock;

    private StockSold(){}

    private StockSold(Builder builder){
        this.stock = builder.stock;
    }

    public double getStock(){
        return stock;
    }

    public static class Builder{

        private double stock;

        public Builder stock(double stock){
            this.stock = stock;
            return this;
        }

        public StockSold build(){return new StockSold(this);}
    }

}
