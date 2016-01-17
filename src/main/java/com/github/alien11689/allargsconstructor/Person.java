package com.github.alien11689.allargsconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
}
