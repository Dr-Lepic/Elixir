import java.util.ArrayList;

public class BMI {
   private double currentBMI;
   private ArrayList<String> BMILog;

    public BMI() {
        this.currentBMI = 0.0;
        BMILog = new ArrayList<>();
        BMILog.add("Weight(kg) " + "Height(m) " + "BMI");
    }

    public void calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        currentBMI = bmi;
        String bmiString = weight + " " + height + " " + bmi;
        BMILog.add(bmiString);
    }

    public double getCurrentBMI() {
        return currentBMI;
    }
    public void showBMILog() {
        System.out.println(BMILog);
    }
}
