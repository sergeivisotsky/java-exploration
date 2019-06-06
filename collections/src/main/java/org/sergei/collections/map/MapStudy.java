package org.sergei.collections.map;

import java.util.HashMap;
import java.util.Map;

class CommonObject {
    private String commonField;

    public CommonObject(String commonField) {
        this.commonField = commonField;
    }

    public String getCommonField() {
        return commonField;
    }

    public void setCommonField(String cmmonField) {
        this.commonField = cmmonField;
    }
}

class FirstObject extends CommonObject {
    private String firstField;

    public FirstObject(String firstField) {
        super(firstField);
        this.firstField = firstField;
    }

    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }
}

class SecondObject extends CommonObject {
    private String secondField;

    public SecondObject(String secondField) {
        super(secondField);
        this.secondField = secondField;
    }

    public String getSecondField() {
        return secondField;
    }

    public void setSecondField(String secondField) {
        this.secondField = secondField;
    }
}

public class MapStudy {

    public static void main(String[] args) {
        Map<String, Class<? extends CommonObject>> elements = new HashMap<>();
        elements.put("First", FirstObject.class);
        elements.put("Second", SecondObject.class);

        System.out.println(elements.get("first"));
    }

}
