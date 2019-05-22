package cputProject.domain.Company;

public class Industry {

    private String type,id;

    private Industry(){}

    private Industry(Builder builder){
        this.type = builder.type;
        this.id = builder.id;
    }

    public String getType(){
        return type;
    }

    public String getId(){return id;}


    public static class Builder{

        private String type,id;

        public Builder type(String type){
            this.type = type;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Industry build(){return new Industry(this);}

    }

}
