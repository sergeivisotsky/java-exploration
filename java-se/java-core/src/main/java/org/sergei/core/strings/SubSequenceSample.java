package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class SubSequenceSample {

    public static void main(String[] args) {
        String text = "abcd";
        text.substring(1, 3);
        text.subSequence(2, 0);
        System.out.println(text);
    }

}
