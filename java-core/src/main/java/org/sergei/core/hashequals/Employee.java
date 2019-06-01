package org.sergei.core.hashequals;

public class Employee extends HumanHashEquals {

    private Double salary;
    private Integer experience;
    
    private Employee(Builder builder) {
        this.salary = builder.salary;
        this.experience = builder.experience;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getExperience() {
        return experience;
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
        private Double salary;
        private Integer experience;

        private Builder() {
        }

        public Builder withSalary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Builder withExperience(Integer experience) {
            this.experience = experience;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((experience == null) ? 0 : experience.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (experience == null) {
            if (other.experience != null)
                return false;
        } else if (!experience.equals(other.experience))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        return true;
    }
    
    
}
