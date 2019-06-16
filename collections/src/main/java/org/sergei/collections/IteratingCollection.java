package org.sergei.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class IteratingCollection {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        Iterator iterator = strings.listIterator(1);
        strings.set(1, "C");
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
