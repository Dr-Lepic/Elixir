import java.util.ArrayList;

public class WaterIntakeTracker {
    private int dailyGoal = 4000; // ml
    private int currentIntake;
    private ArrayList<String> intakeLog = new ArrayList<>();

    public WaterIntakeTracker() {
        intakeLog.add("Date         Amount(ml)     Total/Goal    Status");
    }

    public void addIntake(int amount) {
        currentIntake += amount;
        String status = currentIntake >= dailyGoal ? "Goal Met" : "Goal Not Met";
        String logEntry = String.format("%-12s %-14d %d/%-9d %s",
                Utils.formatDate(), amount, currentIntake, dailyGoal, status);
        intakeLog.add(logEntry);
    }

    public void showIntakeLog() {
        intakeLog.forEach(System.out::println);
    }
}