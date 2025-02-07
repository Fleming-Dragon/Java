import java.time.LocalDate;
import java.time.LocalTime;

interface Temp
{
    void display();
}
public class day5_1
{
    public static void main(String[] args) {
//        LocalTime time = LocalTime.now();
//
//
//        System.out.println("Current Time : " + time);
//
//
//        LocalDate date = LocalDate.now();
//        System.out.println("Current Time : " + date.getDayOfWeek());

        Temp m1 = () -> System.out.println("Hello this is ved");

        m1.display();

    }
}
