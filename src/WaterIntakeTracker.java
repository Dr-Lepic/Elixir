import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class WaterIntakeTracker {
    private int dailyGoal = 4000; // ml
    private int currentIntake;
    private ArrayList<String> intakeLog = new ArrayList<>();

    public WaterIntakeTracker() {
        intakeLog.add("Date       Amount(ml)  Total/Goal  Status");
    }

    public void addIntake(int amount) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = formatter.format(date);
        currentIntake += amount;
        String status = currentIntake >= dailyGoal ? "Goal Met" : "Goal Not Met";
        String logEntry = String.format("%-10s %-10d %d/%-7d %s",
                formattedDate, amount, currentIntake, dailyGoal, status);
        intakeLog.add(logEntry);
    }

    public void showIntakeLog() {
        intakeLog.forEach(System.out::println);
    }
}