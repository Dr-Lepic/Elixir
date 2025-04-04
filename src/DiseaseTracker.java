import java.util.ArrayList;

public class DiseaseTracker {
    private ArrayList<String> diseaseLog = new ArrayList<>();

    public DiseaseTracker() {
        diseaseLog.add("Date         Disease    Description");
    }

    public void addDisease(String date, String disease, String description) {
        diseaseLog.add(String.format("%-12s %-10s %s", date, disease, description));
        System.out.println("\nDisease logged successfully!");
    }

    public void showDiseaseHistory() {
        diseaseLog.forEach(System.out::println);
    }
}