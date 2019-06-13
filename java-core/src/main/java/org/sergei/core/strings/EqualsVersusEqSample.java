package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class EqualsVersusEqSample {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String(str1);

        System.out.println("Values are equal: " + str1.equals(str2)); // true
        System.out.println("References are equal: " + (str1 == str2)); // false

    }

}
