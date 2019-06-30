package org.sergei.jdbc.dao;

/**
 * @author Sergei Visotsky
 */
public class Department {

    private final String title;
    private final Integer numberOfPatients;

    private Department(Builder builder) {
        title = builder.title;
        numberOfPatients = builder.numberOfPatients;
    }

    public String getTitle() {
        return title;
    }

    public Integer getNumberOfPatients() {
        return numberOfPatients;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String title;
        private Integer numberOfPatients;

        private Builder() {
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withNumberOfPatients(Integer val) {
            numberOfPatients = val;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}
