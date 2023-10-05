package xyz.sahia.ensembler.adapter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatagePourView {

    //Date format pour le browser <input type ="date"> tag est YYY-MM-DD -- tirer pas de /
    // Time format de meme <input type "time"> tag est HH:MM 24h format

    public static final DateTimeFormatter YYYY_MM_DD_HH_MM_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    public static ZonedDateTime fromBrowserDateAndTime(String rawDate, String rawTime) {
        LocalDateTime localDateTime = LocalDateTime.parse(rawDate + " " + rawTime,
                YYYY_MM_DD_HH_MM_FORMATTER);
        return ZonedDateTime.of(localDateTime, ZoneId.of("America/Los_Angeles"));
    }

    public static String formatAsDate(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("MM/dd/yyyy").format(localDateTime);
    }
}
