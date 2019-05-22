package cputProject.domain.Login;

public class UserValidation {
    private String message,id;

    private UserValidation(){}

    private UserValidation(Builder builder){
        this.id = builder.id;
        this.message = builder.message;
    }
    public String getId(){return id;}

    public String getMessage(){
        return message;
    }

    public static class Builder{

        private String message,id;

        public Builder message(String mess){
            this.message = mess;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public UserValidation build(){return new UserValidation(this);}
    }

}
