package cputProject.domain.Login;

public class Password {
    private String password;

    private Password(){}
    private Password(Builder builder){
        this.password = builder.password;
    }

    public String getPassword(){return password;}

    public static class Builder{
        private String password;

        public Builder password(String password){
            this.password = password;
            return this;
        }
        public Password build(){return new Password(this);}
    }
}
