package cputProject.domain.Login;

public class Login {
    private String userName;

    private Login(){}

    private Login(Builder builder){
        this.userName = builder.userName;
    }

    public String getLogin(){
        return userName;
    }

    public static class Builder{

        private String userName;

        public Builder login(String login){
            this.userName = userName;
            return this;
        }

        public Login build(){return new Login(this);}
    }

}
