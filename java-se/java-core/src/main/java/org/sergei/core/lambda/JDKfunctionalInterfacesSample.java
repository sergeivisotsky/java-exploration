package org.sergei.core.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Sergei Visotsky
 */
class Person {
    private Integer age;

    Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

public class JDKfunctionalInterfacesSample {


    public static void main(String[] args) {
        // Consumers
        Consumer<String> print = System.out::println;
        print.accept("Consumer production");

        // Suppliers
        Supplier<Person> stringSupplier = Person::new;
        stringSupplier.get();

        // Functions
        Function<Person, Integer> streamMapper = Person::getAge;
        streamMapper.apply(new Person());

        // Predicates
        Predicate<Person> ageGreater = person -> person.getAge() > 18;
        ageGreater.test(new Person());
    }
}
