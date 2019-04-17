package cputProject.domain.Login;

public class Login {
    private String login;

    private Login(){}

    private Login(Builder builder){
        this.login = builder.login;
    }

    public String getLogin(){
        return login;
    }

    public static class Builder{

        private String login;

        public Builder login(String login){
            this.login = login;
            return this;
        }

        public Login build(){return new Login(this);}
    }

}
