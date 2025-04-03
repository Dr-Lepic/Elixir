import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Arrays;

public class WorkoutTracker {
    public enum Exercise {
        RUNNING(8.0), CYCLING(7.5), SWIMMING(6.0), WEIGHTLIFTING(3.5), YOGA(2.8);
        final double met;
        Exercise(double met) { this.met = met; }
    }

    private ArrayList<String> workoutLog;
    private double userWeight;

    public WorkoutTracker(double userWeight) {
        this.userWeight = userWeight;
        this.workoutLog = new ArrayList<>();
        workoutLog.add("Date         Exercise        Duration(min)  Calories");
    }

    public boolean logWorkout(String exerciseName, int durationMinutes) {
        try {
            Exercise exercise = Exercise.valueOf(exerciseName.toUpperCase());
            double caloriesBurned = calculateCaloriesBurned(exercise, durationMinutes);
            String date = Utils.formatDate();
            String logEntry = String.format("%-12s %-20s %-11d %.1f", date, exercise, durationMinutes, caloriesBurned);
            workoutLog.add(logEntry);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid exercise name. Available exercises: " +
                    Arrays.toString(Exercise.values()));
            return false;
        }
    }

    private double calculateCaloriesBurned(Exercise exercise, int durationMinutes) {
        return ((exercise.met * userWeight * 3.5) / 200) * durationMinutes;
    }

    public void showWorkoutLog() {
        workoutLog.forEach(System.out::println);
    }

    public static String getAvailableExercises() {
        return Arrays.toString(Exercise.values());
    }
}