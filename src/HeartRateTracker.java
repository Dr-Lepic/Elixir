import java.util.ArrayList;
import java.util.Date;

public class HeartRateTracker {
    private ArrayList<String> heartRateLog = new ArrayList<>();

    public HeartRateTracker() {
        heartRateLog.add("Date     Time    Rate(bpm)  Status");
    }

    public void addReading(int rate) {
        String date = Utils.formatDateAndTime(new Date());
        String status = getStatus(rate);
        heartRateLog.add(String.format("%-16s %-10d %s", date, rate, status));
    }

    private String getStatus(int rate) {
        if (rate < 60) return "Bradycardia";
        if (rate <= 100) return "Normal";
        return "Tachycardia";
    }

    public void showLog() {
        heartRateLog.forEach(System.out::println);
    }
}