package com.github.alien11689.justdata;

import lombok.Data;

@Data
public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String email;
}
