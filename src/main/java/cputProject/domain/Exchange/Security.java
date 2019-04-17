package cputProject.domain.Exchange;

public class Security {
    private String sec;

    private Security(){}

    private Security(Builder builder){
        this.sec = builder.sec;
    }

    public String getSec(){
        return sec;
    }

    public static class Builder{

        private String sec;

        public Builder sec(String sec){
            this.sec = sec;
            return this;
        }

        public Security build(){return new Security(this);}
    }

}
