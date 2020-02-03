package date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Current date: " + currentDate);

    }
}
