import java.util.ArrayList;
import java.util.Date;

public class BloodPressureTracker {
    private ArrayList<String> bpLog = new ArrayList<>();

    public BloodPressureTracker() {
        bpLog.add("Date     Time    Systolic  Diastolic  Category");
    }

    public void addReading(int systolic, int diastolic) {
        String date = Utils.formatDateAndTime(new Date());
        String category = categorize(systolic, diastolic);
        bpLog.add(String.format("%-16s %-9d %-10d %s", date, systolic, diastolic, category));
    }

    private String categorize(int systolic, int diastolic) {
        if (systolic < 120 && diastolic < 80) return "Normal";
        if (systolic < 130 && diastolic < 80) return "Elevated";
        if (systolic < 140 || diastolic < 90) return "Hypertension Stage 1";
        if (systolic < 180 || diastolic < 120) return "Hypertension Stage 2";
        return "Hypertensive Crisis";
    }

    public void showLog() {
        bpLog.forEach(System.out::println);
    }
}