package org.sergei.core;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Sergei Visotsky
 */

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class PredicateSample {

    static List<Person> filter(List<Person> input, Predicate<Person> predicate) {
        return null;
        // TODO...........
    }

    public static void main(String[] args) {

    }

}
