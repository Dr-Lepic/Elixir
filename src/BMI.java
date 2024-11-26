import java.util.ArrayList;

public class BMI {
    double currentBMI;
    ArrayList<String> BMILog;

    public BMI() {
        this.currentBMI = 0.0;
        BMILog = new ArrayList<>();
    }

    public void calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        currentBMI = bmi;
        String bmiString = weight + " " + height + " " + bmi;
        BMILog.add(bmiString);
    }
}
