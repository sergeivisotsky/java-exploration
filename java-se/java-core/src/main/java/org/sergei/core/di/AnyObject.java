package org.sergei.core.di;

/**
 * @author Sergei Visotsky
 */
public class AnyObject {

    private String firstField;
    private String secondField;
    private String thirdField;

    public AnyObject(String firstField, String secondField, String thirdField) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.thirdField = thirdField;
    }

    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }

    public String getSecondField() {
        return secondField;
    }

    public void setSecondField(String secondField) {
        this.secondField = secondField;
    }

    public String getThirdField() {
        return thirdField;
    }

    public void setThirdField(String thirdField) {
        this.thirdField = thirdField;
    }
}
