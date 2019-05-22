package cputProject.domain.Company;

public class Company {

    private String companyId;
    private String name;
    private Product product;

    public Company(){}

    private Company(Builder builder){
        this.name = builder.name;

    }

    public String getCompanyId(){return companyId;}

    public String getName() {
        return name;
    }

    public Product getProduct(){return product;}

    public static class Builder{

        private String companyId;
        private String name;
        private Product product;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder product(Product product) {
            this.product = product;
            return this;
        }

        public Builder companyId(String companyId){
            this.companyId = companyId;
            return this;
        }

        public Company build() {
            return new Company(this);
        }

    }

    @Override
    public String toString() {
        return "Company ID" + companyId + '\'' +
                "Company Name" + name + '\''+
                "Product" + product + '\'';
    }

}
