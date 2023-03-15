// 브론즈 5
import java.time.LocalDate;
import java.time.ZoneId;


public class BOJ_10699 {
    public static void main(String[] args) {
        LocalDate seoulNow=LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(seoulNow);
    }
}
