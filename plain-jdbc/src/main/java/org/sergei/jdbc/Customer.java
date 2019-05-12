package org.sergei.jdbc;

public class Customer {
    
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Double profit;
    
    private Customer(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.profit = builder.profit;
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
    
    /**
     * Creates builder to build {@link Customer}.
     * @return created builder
     */
    public static Builder builder() {
        return new Builder();
    }
    /**
     * Builder to build {@link Customer}.
     */
    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private Integer age;
        private Double profit;

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

        public Builder withProfit(Double profit) {
            this.profit = profit;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
