package org.sergei.collections;

/**
 * @author Sergei Visotsky
 */
public class ArraysSample {

    public static void main(String[] args) {

        String[][] strings = {{"a", "b"}, {"b", "e"}, {"c", "f"}};

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.println(strings[i][j] + " ");
            }
            System.out.println();
        }
        
    }

}
