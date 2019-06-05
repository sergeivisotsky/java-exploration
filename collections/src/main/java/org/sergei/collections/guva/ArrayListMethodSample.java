package org.sergei.collections.guva;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodSample {

    public static void main(String[] args) {

        ArrayList<Integer> guavaList = Lists.newArrayList();
        long startGL = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            guavaList.add(i);
        }
        long endGL = System.nanoTime();
        System.out.println("Guava ArrayList performance: " + (endGL - startGL));

        List<Integer> list = new ArrayList<>();
        long startList = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        long endList = System.nanoTime();
        System.out.println("Java collections ArrayList performance: " + (endList - startList));


    }

}
