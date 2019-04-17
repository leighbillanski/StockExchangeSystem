package cputProject.domain.Exchange;

public class Order {
    private String order;

    private Order(){}

    private Order(Builder builder){
        this.order = builder.order;
    }

    public String getOrder(){
        return order;
    }

    public static class Builder{

        private String order;

        public Builder order(String order){
            this.order = order;
            return this;
        }

        public Order build(){return new Order(this);}
    }

}
