package com.github.alien11689.builder

import spock.lang.Specification

class PersonTest extends Specification {
    def 'use builder'() {
        when:
            Person p = Person.builder()
                    .firstName('John')
                    .lastName('Smith')
                    .age(30).build()
        then:
            with(p) {
                firstName == 'John'
                lastName == 'Smith'
                age == 30
            }
    }
}
