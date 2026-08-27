import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class task22 {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2026, 1, 1);
        LocalDate secondDate = LocalDate.of(2026, 8, 21);
        long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Days between dates: " + days);
    }
}
