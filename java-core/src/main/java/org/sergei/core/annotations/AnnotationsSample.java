package org.sergei.core.annotations;

import java.lang.reflect.Method;

public class AnnotationsSample {

    @Start
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
            Method method = cl.getMethod("startHello", String.class);

            Start anno = method.getAnnotation(Start.class);
            
            System.out.println(anno.value());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
