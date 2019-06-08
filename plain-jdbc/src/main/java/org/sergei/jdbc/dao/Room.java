package org.sergei.jdbc.dao;

/**
 * @author Sergei Visotsky
 */
public class Room {

    private final Integer roomNumber;
    private final String roomTitle;

    private Room(Builder builder) {
        roomNumber = builder.roomNumber;
        roomTitle = builder.roomTitle;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public String getRoomTitle() {
        return roomTitle;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Integer roomNumber;
        private String roomTitle;

        private Builder() {
        }

        public Builder withRoomNumber(Integer val) {
            roomNumber = val;
            return this;
        }

        public Builder withRoomTitle(String val) {
            roomTitle = val;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }
}
