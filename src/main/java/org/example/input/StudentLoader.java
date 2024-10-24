package org.example.input;

import com.github.javafaker.Faker;
import org.example.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentLoader implements Loader<Student> {
    @Override
    public List<Student> loadRnd(int count) {
        Faker faker = Loader.getFaker();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            students.add(
                    new Student.StudentBuilder()
                            .setAvgScore(faker.number().randomDouble(2,0,10))
                            .setNumberGroup(faker.number().randomDigitNotZero())
                            .setRecordBookNumber(faker.number().numberBetween(10000000,99999999))
                            .build()
            );
        }
        return students;
    }
}
