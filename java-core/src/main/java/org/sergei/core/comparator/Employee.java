package org.sergei.core.comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Double salary;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.salary = builder.salary;
    }    

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }
    
    @Override
    public int compare(Employee empOne, Employee empTwo) {
        return (int) (empOne.salary - empTwo.salary);
    }
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", salary=" + salary + "]";
    }

    /**
     * Creates builder to build {@link Employee}.
     * @return created builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder to build {@link Employee}.
     */
    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private Integer age;
        private Double salary;

        private Builder() {
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withSalary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
    
}
