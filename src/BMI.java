import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class BMI {
   private double currentBMI;
    Date lastUpdated;
    public ArrayList<String> BMILog;

    public BMI() {
        this.currentBMI = 0.0;
        BMILog = new ArrayList<>();
        BMILog.add("Weight(kg)    Height(m)    BMI      Status");
    }

    public void calculateBMI(double weight, double height) {
        if(Objects.equals(lastUpdated, new Date())) {
            System.out.println("BMI already calculated today");
            return;
        }
        double bmi = weight / (height * height);
        currentBMI = bmi;
        String bmiString = String.format("%-14.1f%-13.2f%-8.1f%s", weight, height, bmi, getBMIStatus());
        BMILog.add(bmiString);
        lastUpdated = new Date();
    }

    public double getCurrentBMI() {
        return currentBMI;
    }

    public void showBMILog() {
        for (String s : BMILog) {
            System.out.println(s);
        }
    }

    // bmi suggestion

    public String getBMIStatus(){
        if(currentBMI < 18.5){
            return "Underweight";
        }
        else if(currentBMI < 25){
            return "Normal Weight";
        }
        else if(currentBMI < 30){
            return "Overweight";
        }
        else if(currentBMI < 35){
            return "Class I Obesity";
        }
        else if(currentBMI < 40){
            return "Class II Obesity";
        }
        else if(currentBMI >= 40){
            return "Class III Obesity";
        }

        return "Invalid";
    }
}
