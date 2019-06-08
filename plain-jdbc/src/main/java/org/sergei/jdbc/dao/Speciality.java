package org.sergei.jdbc.dao;

/**
 * @author Sergei Visotsky
 */
public class Speciality {

    private final String title;
    private final Integer requiredExperience;

    private Speciality(Builder builder) {
        title = builder.title;
        requiredExperience = builder.requiredExperience;
    }

    public String getTitle() {
        return title;
    }

    public Integer getRequiredExperience() {
        return requiredExperience;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String title;
        private Integer requiredExperience;

        private Builder() {
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withRequiredExperience(Integer val) {
            requiredExperience = val;
            return this;
        }

        public Speciality build() {
            return new Speciality(this);
        }
    }
}
