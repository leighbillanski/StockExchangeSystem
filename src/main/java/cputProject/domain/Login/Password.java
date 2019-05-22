package cputProject.domain.Login;

public class Password {
    private String password,id;

    private Password(){}
    private Password(Builder builder){
        this.id = builder.id;
        this.password = builder.password;
    }

    public String getId(){return id;}

    public String getPassword(){return password;}

    public static class Builder{
        private String password,id;

        public Builder password(String password){
            this.password = password;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Password build(){return new Password(this);}
    }
}
