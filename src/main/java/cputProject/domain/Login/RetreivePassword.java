package cputProject.domain.Login;

public class RetreivePassword {
    private String oldPassword,newPassword;

    private RetreivePassword(Builder builder){
        this.oldPassword = builder.oldPassword;
        this.newPassword = builder.newPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public static class Builder{
        private String oldPassword,newPassword;

        public Builder oldPassword(String oldPassword){
            this.oldPassword = oldPassword;
            return  this;
        }
        public Builder newPassword(String newPassword){
            this.newPassword = newPassword;
            return this;
        }
        public RetreivePassword build(){return new RetreivePassword(this);}

        @Override
        public String toString() {
            return "Builder{" +
                    "oldPassword='" + oldPassword + '\'' +
                    ", newPassword='" + newPassword + '\'' +
                    '}';
        }
    }
}
