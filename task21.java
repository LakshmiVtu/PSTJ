import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task21 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2026, 8, 21, 14, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(dateTime.format(formatter));
    }
}
