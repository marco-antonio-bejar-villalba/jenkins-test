package com.example.jenkinstest.model;

import com.github.javafaker.Faker;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Client {

  private static Faker faker = Faker.instance();
  private static ThreadLocalRandom random = ThreadLocalRandom.current();
  private String name;
  private String lastName;
  private int age;
  private String department;

  public static Client createClient() {

    return new Client(faker.name().name(), faker.name().lastName(), random.nextInt(90),
        faker.commerce().department());

  }

  private Client(String name, String lastName, int age, String department) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.department = department;
  }


}
