package cputProject.domain.Exchange;

public class User implements Person{
    private String fName,lName;

    private User(){}
    private User(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
    }
    public String getfName(){return fName;}
    public String getlName(){return lName;}
    public static class Builder{
        String fName,lName;

        public Builder fName(String fName){
            this.fName = fName;
            return this;
        }
        public Builder lName(String lName){
            this.lName = lName;
            return this;
        }

        public User build(){return new User(this);}
    }


    }

