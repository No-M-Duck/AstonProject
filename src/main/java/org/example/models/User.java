package org.example.models;

public class User {

    private final String name;
    private final String password;
    private final String email;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String email;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
