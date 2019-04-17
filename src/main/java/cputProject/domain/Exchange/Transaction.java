package cputProject.domain.Exchange;

public class Transaction {
    private String desc;

    public Transaction(){}

    private Transaction(Builder builder){
        this.desc = builder.desc;
    }

    public String getDesc(){
        return desc;
    }

    public static class Builder{

        private String desc;

        public Builder desc(String desc){
            this.desc = desc;
            return this;
        }

        public Transaction build(){return new Transaction(this);}
    }

}
