package cputProject.domain.Exchange;

public class StockAvailable {
    private double stock;

    private StockAvailable(){}

    private StockAvailable(Builder builder){
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

        public StockAvailable build(){return new StockAvailable(this);}
    }

}
