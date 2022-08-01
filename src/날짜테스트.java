import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class 날짜테스트 {
    public static void main(String[] args){
        Date today = new Date();
        System.out.println(today);

        Date today2 = Calendar.getInstance().getTime();
        System.out.println(today);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(today));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));


        System.out.println(localDateTime.plusYears(1).plusMonths(1).plusDays(1).format(dateTimeFormatter));
    }
}
