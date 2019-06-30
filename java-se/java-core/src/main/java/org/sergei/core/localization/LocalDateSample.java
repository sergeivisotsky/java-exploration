package org.sergei.core.localization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Sergei Visotsky
 */
public class LocalDateSample {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDate parsedDate = LocalDate.parse("2011-12-03+01:00", DateTimeFormatter.ISO_OFFSET_DATE);
        System.out.println("Current date is: " + currentDate);
        System.out.println("Parsed date: " + parsedDate);

    }

}
