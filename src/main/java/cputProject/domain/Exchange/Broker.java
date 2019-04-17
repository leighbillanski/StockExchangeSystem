package cputProject.domain.Exchange;

public class Broker implements Person{

    private String fName,lNanme;
    private Broker(Builder builder){
        this.fName = builder.fName;
        this.lNanme = builder.lName;
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
        public Broker build(){return new Broker(this);}
    }
}
