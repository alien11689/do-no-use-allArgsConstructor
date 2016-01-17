package com.github.alien11689.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String email;
}
