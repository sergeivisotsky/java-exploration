package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class LastIndexOfSample {

    public static void main(String[] args) {

        String str = "ha he hello";
        int index = str.lastIndexOf("h", 2);
        System.out.println(index);

        String abc = "abcdfgbcfabc";
        int index1 = abc.lastIndexOf("abc");
        System.out.println(index1);
        int index2 = abc.lastIndexOf("gbc", index1);
        System.out.println(index2);
    }

}
