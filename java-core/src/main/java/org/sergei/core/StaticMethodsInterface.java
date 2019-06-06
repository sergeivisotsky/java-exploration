package org.sergei.core;

interface IActions {
    default String hello() {
        return "hello";
    }

    static String bye() {
        return "bye";
    }
}

public class StaticMethodsInterface implements IActions {

    Object hello = hello();



}
