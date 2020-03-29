package org.sergei.core.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Sergei Visotsky
 */
public class DateSample {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("Current date: %d", date.getDate());
        System.out.printf("\nCurrent time: %d", date.getTime());

        LocalDate localDate = LocalDate.now();
        System.out.printf("\nLocal current date: %s", localDate);

        LocalDateTime localDateTime = LocalDateTime.now()
//                .atZone(ZoneId.systemDefault())
                .atZone(ZoneId.of("UTC"))
                .toLocalDateTime();
        System.out.printf("\nLocal Date and time: %s", localDateTime);
        System.out.println();

        Instant ldtAsInstantAtUTC = LocalDateTime.now()
                .atZone(ZoneId.of("UTC"))
                .toInstant();
        System.out.println(ldtAsInstantAtUTC);
    }

}
