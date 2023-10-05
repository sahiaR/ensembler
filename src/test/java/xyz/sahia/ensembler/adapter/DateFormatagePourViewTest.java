package xyz.sahia.ensembler.adapter;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DateFormatagePourViewTest {
    @Test
    public void browserFormattedDateAndTimeAreConvertedToZonedDateTime() throws Exception {
        String rawDate = "2023-10-05";
        String rawTime = "09:00";

        ZonedDateTime zonedDateTime = DateFormatagePourView.fromBrowserDateAndTime(rawDate, rawTime);

        assertThat(zonedDateTime)
                .isEqualTo(ZonedDateTime.of(2023, 10, 05,
                        9, 0, 0, 0,
                        ZoneId.of("America/Los_Angeles")));
    }
}