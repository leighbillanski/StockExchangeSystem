package cputProject.domain.Company;

public class Industry {

    private String type;

    private Industry(){}

    private Industry(Builder builder){
        this.type = builder.type;
    }

    public String getType(){
        return type;
    }

    public static class Builder{

        private String type;

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Industry build(){return new Industry(this);}

    }

}
