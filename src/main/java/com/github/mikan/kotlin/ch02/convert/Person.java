package com.github.mikan.kotlin.ch02.convert;

/**
 * List 2.3 (P29)
 */
public class Person {
    private final String name;
    private boolean married;

    public Person(String name, boolean married) {
        this.name = name;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return married;
    }
}
