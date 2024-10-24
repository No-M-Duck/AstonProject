package org.example.input;

import com.github.javafaker.Faker;
import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserLoader implements Loader<User>{
    @Override
    public List<User> loadRnd(int count) {
        Faker faker = Loader.getFaker();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            users.add(
                    new User.UserBuilder()
                            .setName(faker.name().firstName())
                            .setPassword(faker.internet().password())
                            .setEmail(faker.internet().emailAddress())
                            .build()
            );
        }
        return users;
    }
}
