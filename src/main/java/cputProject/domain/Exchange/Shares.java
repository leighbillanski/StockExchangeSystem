package cputProject.domain.Exchange;

public class Shares {
    private double share;

    private Shares(){}

    private Shares(Builder builder){
        this.share = builder.share;
    }

    public double getShare(){
        return share;
    }

    public static class Builder{

        private double share;

        public Builder order(double share){
            this.share = share;
            return this;
        }

        public Shares build(){return new Shares(this);}
    }

}
