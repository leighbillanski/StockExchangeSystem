package cputProject.domain.Company;

public class Product {

    private String productId;
    private String productName;

    private Product(){}
    private Product(Builder builder){
        this.productId = builder.productId;
        this.productName = builder.productName;
    }

    public String getProductId(){return productId;}
    public String getProductName(){return productName;}

    public static class Builder{
        private String productId;
        private String productName;

        public Builder productId(String productId){
            this.productId = productId;
            return this;
        }
        public Builder productName(String productName){
            this.productName = productName;
            return this;
        }
        public Product build(){return new Product(this);}
    }
}
