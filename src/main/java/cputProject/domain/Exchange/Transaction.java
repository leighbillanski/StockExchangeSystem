package cputProject.domain.Exchange;

public class Transaction {
    private String desc,id;

    public Transaction(){}

    private Transaction(Builder builder){
        this.id = builder.id;
        this.desc = builder.desc;
    }

    public String getId(){return id;}

    public String getDesc(){
        return desc;
    }

    public static class Builder{

        private String desc,id;

        public Builder desc(String desc){
            this.desc = desc;
            return this;
        }

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Transaction build(){return new Transaction(this);}
    }

}
