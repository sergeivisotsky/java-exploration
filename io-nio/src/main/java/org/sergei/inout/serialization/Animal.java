package org.sergei.inout.serialization;

import java.io.Serializable;

public class Animal implements Serializable {

    private static final long serialVersionUID = -518075963961965185L;

    private Long id;
    private String name;
    private String type;
    private String breed;
    private Double weight;

    private Animal(Builder builder) {
        id = builder.id;
        name = builder.name;
        type = builder.type;
        breed = builder.breed;
        weight = builder.weight;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public Double getWeight() {
        return weight;
    }

    public static final class Builder {
        private Long id;
        private String name;
        private String type;
        private String breed;
        private Double weight;

        private Builder() {
        }

        public Builder withId(Long val) {
            id = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withType(String val) {
            type = val;
            return this;
        }

        public Builder withBreed(String val) {
            breed = val;
            return this;
        }

        public Builder withWeight(Double val) {
            weight = val;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
