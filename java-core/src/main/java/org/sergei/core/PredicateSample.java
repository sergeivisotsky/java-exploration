package org.sergei.core;

import java.util.ArrayList;
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

//    static List<Person> filter(List<Person> input, Predicate<Person> predicate) {
//        var output = new ArrayList<>();
//        for (Person person : input) {
//            if (predicate.test(person)) {
//                output.add(person);
//            }
//            return output;
//        }
//        return output;
//    }

    public static void main(String[] args) {

    }

}
