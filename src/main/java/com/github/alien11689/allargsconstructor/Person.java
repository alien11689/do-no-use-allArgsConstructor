package com.github.alien11689.allargsconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String email;

    public Person(String firstName, String lastName, Integer age) {
        this(firstName, lastName, age, null);
    }
}
