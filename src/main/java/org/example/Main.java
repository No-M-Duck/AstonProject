package org.example;

import com.github.javafaker.Faker;
import org.example.Validation.BusValidator;
import org.example.Validation.StudentValidator;
import org.example.Validation.UserValidator;
import org.example.Validation.Validator;
import org.example.input.BusLoader;
import org.example.input.StudentLoader;
import org.example.input.UserLoader;
import org.example.models.Bus;
import org.example.models.Student;
import org.example.models.User;

import java.util.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        StudentLoader userLoader = new StudentLoader();
        List<Student> students = new ArrayList<>();
        students = userLoader.loadRnd(5);
        students.stream().forEach(System.out::println);
    }
}