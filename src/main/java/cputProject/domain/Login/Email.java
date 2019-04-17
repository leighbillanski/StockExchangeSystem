package cputProject.domain.Login;

public class Email {

    private String emailAddres;

    private Email() {}
    private Email(Builder builder){
        this.emailAddres = builder.emailAddres;
    }

    public String getEmailAddres(){return emailAddres;}

    public static class Builder{
        private String emailAddres;

        public Builder emailAddres(String emailAddres){
            this.emailAddres = emailAddres;
            return this;
        }

        public Email build(){return new Email(this);}

    }
}
