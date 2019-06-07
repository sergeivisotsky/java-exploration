package org.sergei.core.annotations;

import java.lang.reflect.Method;

/**
 * @author Sergei Visotsky
 */
public class AnnotationsSample {

    @Start("Hello")
    static String startHello(String text) {
        return text;
    }

    @Stop
    static String stopHello(String text) {
        return text;
    }

    public static void main(String[] args) {

        AnnotationsSample as = new AnnotationsSample();

        try {
            Class<?> cl = as.getClass();
            Method method = cl.getDeclaredMethod("startHello", String.class);

            Start start = method.getAnnotation(Start.class);

            System.out.println(start.value());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
