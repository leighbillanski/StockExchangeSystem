package cputProject.domain.Login;

public class UserValidation {
    private String message;

    private UserValidation(){}

    private UserValidation(Builder builder){
        this.message = builder.message;
    }

    public String getMessage(){
        return message;
    }

    public static class Builder{

        private String message;

        public Builder message(String mess){
            this.message = mess;
            return this;
        }

        public UserValidation build(){return new UserValidation(this);}
    }

}
