package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class InternSample {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";

        System.out.println("str1 = str2 (values): " + str1.equals(str2));
        System.out.println("str1 = str2 (objects): " + (str1 == str2));
        str1.intern();

    }

}
