package cputProject.domain.Login;

import cputProject.domain.Exchange.User;

public class Register {
    private String email;
    private String userName;
    private String password;

    private Register(Builder builder) {
        this.email = builder.email;
        this.userName = builder.userName;
        this.password = builder.password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String email, password, userName;

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", userName='" + userName + '\'' +
                    '}';
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Register build() {
            return new Register(this);
        }
    }
}
