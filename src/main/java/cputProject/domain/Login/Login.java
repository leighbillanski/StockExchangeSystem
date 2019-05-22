package cputProject.domain.Login;

public class Login {
    private UserName userName;
    private Password password;
    private String id;

    private Login(){}

    private Login(Builder builder){
        this.password = builder.password;
        this.userName = builder.userName;
        this.id = builder.id;
    }

    public UserName getLogin(){
        return userName;
    }
    public Password getPassword(){return password;}
    public String getId(){return id;}

    public static class Builder{

        private UserName userName;
        private Password password;
        private String id;

        public Builder login(UserName userName){
            this.userName = userName;
            return this;
        }
        public Builder password(Password password){
            this.password = password;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Login build(){return new Login(this);}
    }

}
