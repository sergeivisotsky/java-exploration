package org.sergei.core.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Splitter {

    @SuppressWarnings("") // TODO: Understand what kinda warning should be suppressed
    private static List<String> split(String line, String regexp) {
        List<String> sequences = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        String[] arr = line.split(String.valueOf(pattern));

        for (String arrElem : arr) {
            stringBuilder.append(arrElem);
        }

        sequences.add(stringBuilder.toString());

        return sequences;
    }

    public static void main(String[] args) {

        String strToSplit = "Hello world, Sergei! From /Developers/";

        List<String> elems = split(strToSplit, "[,/]");
        elems.forEach(System.out::println);

    }

}
