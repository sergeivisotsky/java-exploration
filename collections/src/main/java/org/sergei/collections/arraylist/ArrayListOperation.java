package org.sergei.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class ArrayListOperation {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("A");
        list.addAll(1, List.of("A"));
        list.clear();
        System.out.println(list);

    }

}
