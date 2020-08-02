package Day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        LocalDate ld= LocalDate.of(2020,07,25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        DateTimeFormatter may = DateTimeFormatter.ofPattern("MMM/dd/yyyy,EEEE hh:mm a");
        LocalDateTime task = LocalDateTime.of(2019,05,20,16,30,10);
        System.out.println(task.format(may));
        System.out.println(LocalDateTime.now().format(may));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);
        System.out.println(Now.format(dtf));
    }
}
