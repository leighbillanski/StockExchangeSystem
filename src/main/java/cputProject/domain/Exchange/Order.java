package cputProject.domain.Exchange;

public class Order {
    private String order,id;

    private Order(){}

    private Order(Builder builder){
        this.order = builder.order;
        this.id = builder.id;
    }

    public String getOrder(){
        return order;
    }

    public String getId(){return id;}

    public static class Builder{

        private String order,id;

        public Builder order(String order){
            this.order = order;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Order build(){return new Order(this);}
    }

}
