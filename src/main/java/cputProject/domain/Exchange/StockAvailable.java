package cputProject.domain.Exchange;

public class StockAvailable {
    private double stock;
    private String id;

    private StockAvailable(){}

    private StockAvailable(Builder builder){
        this.id = builder.id;
        this.stock = builder.stock;
    }

    public double getStock(){
        return stock;
    }

    public String getId(){
        return id;
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

        public StockAvailable build(){return new StockAvailable(this);}
    }

}
