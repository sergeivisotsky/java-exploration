package org.sergei.core.comparable;

import java.lang.Comparable;

public class HumanComparable implements Comparable<HumanComparable> {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    
    public HumanComparable() {
    }

    public HumanComparable(Long id, String firstName, String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HumanComparable [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }

    @Override
    public int compareTo(HumanComparable obj) {

        if (this.getAge() > obj.getAge()) {
           return 1;
        } else {
            return -1;
        }
        
    }
    
}
