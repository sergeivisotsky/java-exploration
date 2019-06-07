package org.sergei.jdbc.dao;

public class Customer {
    
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Double profit;

    private Customer(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        profit = builder.profit;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public Double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", profit=" + profit + "]";
    }

    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private Integer age;
        private Double profit;

        private Builder() {
        }

        public Builder withId(Long val) {
            id = val;
            return this;
        }

        public Builder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public Builder withLastName(String val) {
            lastName = val;
            return this;
        }

        public Builder withAge(Integer val) {
            age = val;
            return this;
        }

        public Builder withProfit(Double val) {
            profit = val;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
