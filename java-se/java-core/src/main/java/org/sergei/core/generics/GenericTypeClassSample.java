package org.sergei.core.generics;

/**
 * @author Sergei Visotsky
 */
public class GenericTypeClassSample<T> {

    private T field;

    private T getField() {
        return field;
    }

    private void setField(T field) {
        this.field = field;
    }

    public static void main(String[] args) {
        GenericTypeClassSample<String> typeClass = new GenericTypeClassSample<>();
        typeClass.setField("Hello");
        System.out.println("Field set before: " + typeClass.getField());
    }

}
