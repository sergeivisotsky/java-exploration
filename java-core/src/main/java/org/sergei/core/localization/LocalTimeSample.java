package org.sergei.core.localization;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Sergei Visotsky
 */
public class LocalTimeSample {

    public static void main(String[] args) {

        LocalTime now = LocalTime.of(10, 10, 10);
        LocalTime start = LocalTime.of(8, 30).withMinute(now.getMinute());
        LocalTime end = LocalTime.of(12, 30).withMinute(now.getMinute());
        long timePassed = now.until(start, ChronoUnit.HOURS);
        long timeToGo = now.until(end, ChronoUnit.HOURS);
        System.out.println(timePassed + " " + timeToGo);
    }

}
