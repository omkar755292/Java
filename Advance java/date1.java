import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class date1 {
    public static void main(String[] args) {
        Date d = new Date(0);
        // System.out.println(d.getTime());
        System.out.println(d);
        // System.out.println(d.getDate());
        // System.out.println(d.getMonth());
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.YEAR)+"/" + c.get(Calendar.MONTH)+"/" + c.get(Calendar.DAY_OF_MONTH));
        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY));
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2022));
    }
}
