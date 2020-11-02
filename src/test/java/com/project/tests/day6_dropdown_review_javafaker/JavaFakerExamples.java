package com.project.tests.day6_dropdown_review_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {

    @Test
    public void faker_test(){

        //We need to create an object from the Faker class to be able to use methods.
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);

        String lastName = faker.name().lastName();
        System.out.println("lastName = " + lastName);

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);

        String address = faker.address().fullAddress();
        System.out.println("address = " + address);

        String house = faker.gameOfThrones().house();
        String quote = faker.gameOfThrones().quote();

        System.out.println("house = " + house);
        System.out.println("quote = " + quote);

        String fact = faker.chuckNorris().fact();
        System.out.println("fact = " + fact);

    }

}
