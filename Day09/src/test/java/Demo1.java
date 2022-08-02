import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = s.format(date);
        System.out.println(format);


        Calendar builder = Calendar.getInstance();
        builder.set(Calendar.DAY_OF_YEAR,2015);
        builder.set(Calendar.MONTH, 4);
//将日数设为第6日
        builder.set(Calendar.DATE,6);
        System.out.println("2015年4月6日是"+builder.get(Calendar.WEEK_OF_YEAR));
    }
}
