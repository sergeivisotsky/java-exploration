package org.sergei.jdbc.dao;

/**
 * @author Sergei Visotsky
 */
public class Doctor {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String position;
    private final Integer experience;
    private final Room room;
    private final Speciality speciality;
    private final Department department;

    private Doctor(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        position = builder.position;
        experience = builder.experience;
        room = builder.room;
        speciality = builder.speciality;
        department = builder.department;
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

    public String getPosition() {
        return position;
    }

    public Integer getExperience() {
        return experience;
    }

    public Room getRoom() {
        return room;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public Department getDepartment() {
        return department;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String position;
        private Integer experience;
        private Room room;
        private Speciality speciality;
        private Department department;

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

        public Builder withPosition(String val) {
            position = val;
            return this;
        }

        public Builder withExperience(Integer val) {
            experience = val;
            return this;
        }

        public Builder withRoom(Room val) {
            room = val;
            return this;
        }

        public Builder withSpeciality(Speciality val) {
            speciality = val;
            return this;
        }

        public Builder withDepartment(Department val) {
            department = val;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }
}
