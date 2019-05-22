package cputProject.domain.Exchange;

public class StockSold {
    private double stock;
    private String id;

    private StockSold(){}

    private StockSold(Builder builder){
        this.id = builder.id;
        this.stock = builder.stock;
    }

    public String getId(){return id;}

    public double getStock(){
        return stock;
    }

    public static class Builder{

        private double stock;
        private String id;

        public Builder stock(double stock){
            this.stock = stock;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public StockSold build(){return new StockSold(this);}
    }

}
