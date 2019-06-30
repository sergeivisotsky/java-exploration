package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class CompareToSample {

    public static void main(String[] args) {

        String[] arr = {"first", "value", "second", "election", "flow",
                        "choice", "value", "quality", "flow"
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    String s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
            System.out.println(arr[i]);
        }
    }

}
