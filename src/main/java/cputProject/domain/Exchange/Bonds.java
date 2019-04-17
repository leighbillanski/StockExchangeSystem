package cputProject.domain.Exchange;

public class Bonds {
    private String bond;

    private Bonds(){}

    private Bonds(Builder builder){
        this.bond = builder.bond;
    }

    public String getBond(){
        return bond;
    }

    public static class Builder{

        private String bond;

        public Builder bond(String bond){
            this.bond = bond;
            return this;
        }

        public Bonds build(){return new Bonds(this);}
    }

}
