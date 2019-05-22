package cputProject.domain.Exchange;

public class Broker implements Person{

    private String fName,lNanme,id;
    private Broker(Builder builder){
        this.fName = builder.fName;
        this.lNanme = builder.lName;
    }

    @Override
    public String getfName() {
        return fName;
    }

    @Override
    public String getlName() {
        return getlName();
    }

    public String getId(){
        return id;
    }

    public static class Builder{
        private String fName,lName,id;

        public Builder fName(String fName){
            this.fName = fName;
            return this;
        }
        public Builder lName(String lName){
            this.lName = lName;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Broker build(){return new Broker(this);}
    }
}
