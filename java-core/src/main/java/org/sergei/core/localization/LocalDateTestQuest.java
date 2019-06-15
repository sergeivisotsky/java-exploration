package org.sergei.core.localization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Sergei Visotsky
 */
public class LocalDateTestQuest {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(2019, 6, 15);
//        System.out.println(d1);
        LocalDate d2 = LocalDate.parse("2019-6-15", DateTimeFormatter.ISO_DATE);
        LocalDate d3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(2019);
//        System.out.println(d3);

        System.out.println(d1.equals(d2) + " " + d2.equals(d3));

    }

}
