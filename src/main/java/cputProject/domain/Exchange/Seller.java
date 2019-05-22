package cputProject.domain.Exchange;

public class Seller implements Person{
    private String fName,lName,id;
    private Seller(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.id = builder.id;
    }
    @Override
    public String getfName() {
        return fName;
    }

    @Override
    public String getlName() {
        return lName;
    }

    public String getId(){return id;}

    public static class Builder{
        private String fName,lName,id;

        public Builder fName(String fName){
            this.fName = fName;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder lName(String lName){
            this.lName = lName;
            return this;
        }
        public Seller build(){return new Seller(this);}
    }
}
