package cputProject.domain.Exchange;

public class Shares {
    private double share;
    private String id;

    private Shares(){}

    private Shares(Builder builder){
        this.id = builder.id;
        this.share = builder.share;
    }

    public String getId(){return id;}

    public double getShare(){
        return share;
    }

    public static class Builder{

        private double share;
        private String id;

        public Builder order(double share){
            this.share = share;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Shares build(){return new Shares(this);}
    }

}
