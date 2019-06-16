package org.sergei.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class ListToArraySample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("A", "B"));
        String[] array1 = {"C"};
        String[] array2 = list.toArray(array1);
        array1[0] = "D";
        System.out.println(Arrays.toString(array2));

    }

}
