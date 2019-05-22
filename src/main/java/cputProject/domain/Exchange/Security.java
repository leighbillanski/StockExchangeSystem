package cputProject.domain.Exchange;

public class Security {
    private String sec,id;

    private Security(){}

    private Security(Builder builder){
        this.id = builder.id;
        this.sec = builder.sec;
    }

    public String getId(){return id;}

    public String getSec(){
        return sec;
    }

    public static class Builder{

        private String sec,id;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder sec(String sec){
            this.sec = sec;
            return this;
        }

        public Security build(){return new Security(this);}
    }

}
