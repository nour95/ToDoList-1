import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nour
{
    public static void main(String[] args)
    {
        String dateString = "22-09-2002";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println(date);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM---yyyy");
        String dateString2 = formatter2.format(date);
        System.out.println(dateString2);

    }
}
