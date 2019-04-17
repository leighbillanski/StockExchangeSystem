package cputProject.domain.Login;

public class UserName {
    private String userId,userName;

    private UserName(){}
    private UserName(Builder builder){
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public static class Builder{
        private String userId,userName;

        public Builder userId(String userId){
            this.userId = userId;
            return this;
        }
        public Builder userName(String userName){
            this.userName = userName;
            return this;
        }
        public UserName build(){return new UserName(this);}
    }
}
