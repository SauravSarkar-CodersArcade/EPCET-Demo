package javaDateClassExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDateTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Unformatted Date & Time: " + obj);
        /**
         * E -> Day of the week (Mon-Sun)
         * D -> Day of the year(1-365)
         * d -> current date
         */
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d, MMM dd yyyy");
        String formattedDateTime = obj.format(format);
        System.out.println(formattedDateTime);
    }
}
