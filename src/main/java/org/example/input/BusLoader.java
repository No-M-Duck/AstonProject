package org.example.input;

import com.github.javafaker.Faker;
import org.example.models.Bus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BusLoader implements Loader<Bus> {


    private static final String LETTERS = "АВЕКМНОРСТУХ";

    @Override
    public List<Bus> loadRnd(int count) {
        Faker faker = Loader.getFaker();
        List<Bus> buses = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            buses.add(
                    new Bus.BusBuilder()
                            .setModel(faker.company().name() + " " + faker.letterify("Model-???"))
                            .setNumber(generateBusNumber(faker))
                            .setMileage(faker.random().nextInt(250000))
                            .build()
            );
        }
        return buses;
    }

    public static String generateBusNumber(Faker faker) {
        char firstLetter = LETTERS.charAt(faker.random().nextInt(LETTERS.length()));
        int digits = faker.number().numberBetween(100, 1000);
        char secondLetter = LETTERS.charAt(faker.random().nextInt(LETTERS.length()));
        char thirdLetter = LETTERS.charAt(faker.random().nextInt(LETTERS.length()));
        int regionCode = faker.number().numberBetween(10, 100);

        return String.format("%c%d%c%c%d", firstLetter, digits, secondLetter, thirdLetter, regionCode);
    }

}
