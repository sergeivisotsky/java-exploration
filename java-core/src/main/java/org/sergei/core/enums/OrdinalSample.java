package org.sergei.core.enums;

enum Vegetables {
    TOMATO, CUCUMBER, REDIS, PAPRIKA
}

public class OrdinalSample {

    public static void main(String[] args) {
        for (Vegetables vegetable : Vegetables.values()) {
            System.out.println(vegetable.ordinal());
        }
    }

}
