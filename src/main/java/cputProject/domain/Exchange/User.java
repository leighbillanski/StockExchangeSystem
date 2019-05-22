package cputProject.domain.Exchange;

public class User implements Person{
    private String fName,lName,id;

    private User(){}
    private User(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.id = builder.id;
    }
    public String getfName(){return fName;}
    public String getlName(){return lName;}
    public String getId(){return id;}

    public static class Builder{
        String fName,lName,id;

        public Builder fName(String fName){
            this.fName = fName;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder lName(String lName){
            this.lName = lName;
            return this;
        }

        public User build(){return new User(this);}
    }


    }

