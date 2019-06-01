package org.sergei.core.reflection;

import java.lang.reflect.Method;

public class MainClass {

    public static void main(String[] args) throws Exception {
        BasicOperations basic = new BasicOperations();
        Class basicClass = basic.getClass();

        Method moveMethod = basicClass.getDeclaredMethod("move");
        moveMethod.setAccessible(true);
        moveMethod.invoke(basic);

        Method[] methods = basicClass.getMethods();

//        for (Method method : methods) {
//            System.out.println(method.toString());
//        }

        for (Method method : methods) {
            MethodMetaData methodMeta = MethodMetaData
                                            .newBuilder()
                                                .withName(method.getName())
                                                .withReturnType(method.getReturnType())
                                                .withParamTypes(method.getParameterTypes())
                                                .withExceptionTypes(method.getExceptionTypes())
                                                .withModifiers(method.getModifiers())
                                            .build();
            System.out.println(methodMeta.toString());
        }
    }

}
