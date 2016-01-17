package com.github.alien11689.allargsconstructor

import spock.lang.Specification

class PersonTest extends Specification {

    def 'use generated allArgsConstructor'() {
        when:
            Person p = new Person('John', 'Smith', 30)
        then:
            with(p) {
                firstName == 'John'
                lastName == 'Smith'
                age == 30
            }
    }
}
