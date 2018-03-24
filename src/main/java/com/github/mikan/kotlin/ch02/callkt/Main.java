package com.github.mikan.kotlin.ch02.callkt;

import com.github.mikan.kotlin.ch02.properties.Person;

/**
 * List 2.6 (P31)
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", true);
        System.out.println(person.getName());
        System.out.println(person.isMarried());
    }
}

// Result:
// Bob
// true
