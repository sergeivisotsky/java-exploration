package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class IndexOfSample {

    public static void main(String[] args) {

        String str = "This is the biggest challenge in the world :)";

        System.out.println(str);
        System.out.println("indexOf(t): " + str.indexOf('t'));
        System.out.println("indexOf(biggest): " + str.indexOf("biggest"));
        System.out.println("indexOf(e, 13): " + str.indexOf('e', 13));
    }

}
