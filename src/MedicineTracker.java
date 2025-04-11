import java.io.Serializable;
import java.util.*;

public class MedicineTracker implements Serializable {
    private static class Medicine implements Serializable {
        String name;
        String dose;
        String schedule;
        List<String> days;

        Medicine(String name, String dose, String schedule, List<String> days) {
            this.name = name;
            this.dose = dose;
            this.schedule = schedule;
            this.days = days;
        }
    }

    private List<Medicine> medicines = new ArrayList<>();

    public void addMedicine(String name, String dose, String schedule, List<String> days) {
        medicines.add(new Medicine(name, dose, schedule, days));
        System.out.println("\nMedicine added successfully!");
    }

    public void showDailySchedule(String day) {
        System.out.println("Medications for " + day + ":");

        for (Medicine medicine : medicines) {
            if (medicine.days.contains(day)) {
                System.out.println("- " + medicine.name + " " + medicine.dose + " at " + medicine.schedule);
            }
        }
    }

    public void showWeeklySummary() {
        Map<String, Integer> weeklySummary = new HashMap<>();

        for (Medicine medicine : medicines) {
            for (String day : medicine.days) {
                weeklySummary.merge(day + " " + medicine.name, 1, Integer::sum);
            }
        }

        System.out.println("Weekly Medication Summary:");
        weeklySummary.forEach((k, v) ->
                System.out.println("- " + k + ": " + v + " doses"));
    }
}