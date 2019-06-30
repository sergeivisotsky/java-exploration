package org.sergei.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class ArrayListListOf {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("A", "B"));
        list.addAll(1, List.of("A", "C"));
        System.out.println(list);
        list.remove("A");
        System.out.println(list);
    }

}
