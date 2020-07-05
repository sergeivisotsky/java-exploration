package org.sergei.rxjava;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Sergei Visotsky
 */
public class AnyPojo {
    private final Long id;
    private final String title;
    private final String purpose;

    private AnyPojo(Builder builder) {
        id = builder.id;
        title = builder.title;
        purpose = builder.purpose;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPurpose() {
        return purpose;
    }

    public static final class Builder {
        private Long id;
        private String title;
        private String purpose;

        private Builder() {
        }

        public Builder withId(Long val) {
            id = val;
            return this;
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withPurpose(String val) {
            purpose = val;
            return this;
        }

        public AnyPojo build() {
            return new AnyPojo(this);
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
