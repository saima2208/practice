package ClassWork;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.time.ZoneId;

public class TimeInAllTimeZones {

    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        // Get the current time in each time zone
        for (String zoneId : allZoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime currentTimeInZone = ZonedDateTime.now(zone);

            // Format the output time
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
            String formattedTime = currentTimeInZone.format(formatter);

            // Print the time in the respective time zone
            System.out.println("Time in " + zoneId + ": " + formattedTime);
        }
    }
}

