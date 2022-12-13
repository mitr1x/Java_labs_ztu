import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main6 {
    public static void main (String args[]) {

        LocalDate start = LocalDate.now();
        LocalDate alldate = LocalDate.of(2022,12,31);
        Integer a;
        a = alldate.getDayOfMonth();
      if (a % 30 == 0){
          System.out.println("unIntercalary");
      }
      else System.out.println("Intercalary");

        LocalDateTime time;
        time = LocalDateTime.now();
        DateTimeFormatter dtf;
        DateTimeFormatter ttf;
        dtf = DateTimeFormatter.ofPattern(("dd-MM-yy HH:mm:ss"));
        ttf = DateTimeFormatter.ofPattern(("HH:mm:ss"));
        System.out.println(time.getDayOfWeek() + " "+dtf.format(time));
        System.out.println(ttf.format(time));

        System.out.println(start.isBefore(alldate));
        System.out.println(start.isAfter(alldate));
        start = start.plusDays(22);
        start = start.plusMonths(1);
        System.out.println(start);
    }
}

