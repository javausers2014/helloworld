import java.time.LocalDateTime;

/**
 * Created by y3user on 28/10/15.
 */
public class DateTimeEx {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime fivedays = time.plusDays(5);
        System.out.println(fivedays);
        LocalDateTime weeks = time.plusWeeks(2);
        System.out.println(weeks);
    }

}
