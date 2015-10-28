import java.time.LocalDateTime;

/**
 * Created by y3user on 28/10/15.
 */
public class DateTimeEx {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime five_days = time.plusDays(5);
        System.out.println(five_days);
        LocalDateTime weeks = time.plusWeeks(2);
        System.out.println(weeks);
    }

}
