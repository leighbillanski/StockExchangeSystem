package cputProject.domain.Exchange;

public class Seller implements Person{
    private String fName,lName;
    private Seller(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
    }
    @Override
    public String getfName() {
        return null;
    }

    @Override
    public String getlName() {
        return null;
    }
    public static class Builder{
        private String fName,lName;

        public Builder fName(String fName){
            this.fName = fName;
            return this;
        }
        public Builder lName(String lName){
            this.lName = lName;
            return this;
        }
        public Seller build(){return new Seller(this);}
    }
}
