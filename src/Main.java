public class Main {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.calculateBMI(61.5, 2);
        System.out.println(bmi.getCurrentBMI());
        bmi.showBMILog();
    }
}
