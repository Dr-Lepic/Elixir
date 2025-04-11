import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

    public static App loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(App.DATA))) {
            return (App) ois.readObject();
        } catch (Exception e) {
            return null; // No existing data
        }
    }
}
