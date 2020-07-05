package org.sergei.rxjava;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TODO description
 *
 * @author Sergei Visotsky
 */
public class FirstPojo {

    private String firstField;
    private String secondField;
    private Integer anyNumber;

    private FirstPojo() {
    }

    public FirstPojo(String firstField, String secondField, Integer anyNumber) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.anyNumber = anyNumber;
    }

    public static FirstPojo create(String firstField, String secondField, Integer anyNumber) {
        return new FirstPojo(firstField, secondField, anyNumber);
    }

    public String getFirstField() {
        return firstField;
    }

    public String getSecondField() {
        return secondField;
    }

    public Integer getAnyNumber() {
        return anyNumber;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
