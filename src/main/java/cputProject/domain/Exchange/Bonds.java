package cputProject.domain.Exchange;

public class Bonds {
    private String bond,id;

    private Bonds(){}

    private Bonds(Builder builder){
        this.bond = builder.bond;
        this.id = builder.id;
    }

    public String getBond(){
        return bond;
    }

    public String getId(){
        return id;
    }

    public static class Builder{

        private String bond,id;

        public Builder bond(String bond){
            this.bond = bond;
            return this;
        }

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Bonds build(){return new Bonds(this);}
    }

}
