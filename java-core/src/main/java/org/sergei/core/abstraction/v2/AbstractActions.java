package org.sergei.core.abstraction.v2;

import java.util.List;
import java.util.StringJoiner;

/**
 * @author Sergei Visotsky
 */
public abstract class AbstractActions {

    private String anyField;

    public String writeThoughts(List<String> elem) {
        StringJoiner joiner = new StringJoiner(" ");
        for (String s : elem) {
            joiner.add(s);
        }
        return joiner.toString();
    }

    public void anyFieldValue(String fldVal) {
        this.anyField = fldVal;
        System.out.println(anyField);
    }

    public abstract String constructCharSequence(List<String> strList);

}
