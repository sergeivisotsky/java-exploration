package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class TrimStrip {

    public static void main(String[] args) {

        String first = "Hello    world    that    is   me!!!    :)";

        System.out.println("trim(): " + first.trim());
        System.out.println("strip(): " + first.strip());


    }

}
