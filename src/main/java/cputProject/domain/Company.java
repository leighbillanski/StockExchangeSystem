package cputProject.domain;

public class Company {

    private String name,product;

    private Company(){}

    private Company(Builder builder){
        this.name = builder.name;
        this.product = builder.product;

    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public static class Builder{

        private String name,product;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder product(String product) {
            this.product = product;
            return this;
        }

        public Company build() {
            return new Company(this);
        }

    }

    @Override
    public String toString() {
        return "Company Name{" + name + '\'' +
                ", Product" + product + '\'' +
                "}";
    }

}
