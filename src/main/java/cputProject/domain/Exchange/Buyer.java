package cputProject.domain.Exchange;

public class Buyer implements Person{
    private String fName,lName;
    private Buyer(Builder builder){
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
        public Buyer build(){return new Buyer(this);}
    }
}
