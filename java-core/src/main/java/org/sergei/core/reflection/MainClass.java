package org.sergei.core.reflection;

import java.lang.reflect.Method;

public class MainClass {

    public static void main(String[] args) throws Exception {
        BasicOperations basic = new BasicOperations();
        Class basicClass = basic.getClass();

        Method moveMethod = basicClass.getDeclaredMethod("move");
        moveMethod.setAccessible(true);
        moveMethod.invoke(basic);
    }

}
