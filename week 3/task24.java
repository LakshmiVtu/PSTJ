import java.time.DayOfWeek;
import java.time.LocalDate;

public class task24 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 8, 21);
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of week: " + day);
    }
}
