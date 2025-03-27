import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String formatDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        return formatter.format(date);
    }
    public static String formatDateAndTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm");
        return formatter.format(date);
    }
}
