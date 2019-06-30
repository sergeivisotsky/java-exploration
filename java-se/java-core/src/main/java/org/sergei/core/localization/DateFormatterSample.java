package org.sergei.core.localization;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Sergei Visotsky
 */
public class DateFormatterSample {

    private static final DateFormat format = new SimpleDateFormat("YYYY-mm-dd HH:mm:ss");
    private static final DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("YYYY-mm-dd HH:mm:ss");

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Date and time using DateFormat: " + format.format(date));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and time using DateTimeFormatter: " + dateTimeFormat.format(dateTime));

        LocalDateTime dateTimeTwo = LocalDateTime.of(2019, 6, 5, 20, 25);
        System.out.println("Date and time using LocalDateTime.of() and DateTimeFormatter: " + dateTimeFormat.format(dateTimeTwo));
    }

}
