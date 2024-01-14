import java.util.StringTokenizer;
import java.util.Calendar;
import java.util.Date;

public class chkst_date_cal {
    public static void main(String[] args) {
        String str = "This is string tokenzier";

        // stringTokenZier

        StringTokenizer st = new StringTokenizer(str);
        System.out.println("TOkenzing the String");
        while (st.hasMoreTokens()) {

            System.out.println(st.nextToken());

        }

        // by using date

        Date d = new Date();
        System.out.println("Current date is " + d);

        // by using calender

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
    }
}
