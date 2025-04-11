import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class BMR implements Serializable {
    private double currentBMR;
    String  lastUpdated;
    private ArrayList<String> BMRLog = new ArrayList<>();

    public BMR() {
        BMRLog.add("Weight(kg)  Height(cm)  Age  BMR      TDEE");
    }

    public boolean calculateBMR(double weight, double height, int age, String activityLevel) {
        if(Objects.equals(lastUpdated, Utils.formatDate())) {
            System.out.println("BMR already calculated today");
            return false;
        }
        double bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;

        currentBMR = bmr;
        double tdee = calculateTDEE(bmr, activityLevel);

        String logEntry = String.format("%-11.1f %-10.1f %-4d %-8.1f %-9.1f ",
                 weight, height, age, bmr, tdee);
        BMRLog.add(logEntry);
        lastUpdated = Utils.formatDate();
        return true;
    }

    private double calculateTDEE(double bmr, String activityLevel) {
        return switch (activityLevel.toLowerCase()) {
            case "sedentary" -> bmr * 1.2;
            case "light" -> bmr * 1.375;
            case "moderate" -> bmr * 1.55;
            case "active" -> bmr * 1.725;
            case "very active" -> bmr * 1.9;
            default -> bmr;
        };
    }

    public void showBMRLog() {
        BMRLog.forEach(System.out::println);
    }
}
