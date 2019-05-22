package cputProject.domain.Login;

public class Email {

    private String emailAddres,id;

    private Email() {}
    private Email(Builder builder){
        this.id = builder.id;
        this.emailAddres = builder.emailAddres;
    }

    public String getId(){return id;}

    public String getEmailAddres(){return emailAddres;}

    public static class Builder{
        private String emailAddres,id;

        public Builder emailAddres(String emailAddres){
            this.emailAddres = emailAddres;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Email build(){return new Email(this);}

    }
}
