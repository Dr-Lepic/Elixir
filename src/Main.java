import java.util.List;

public class Main {
    public static void main(String[] args) {
//        BMI bmi = new BMI();
//        bmi.calculateBMI(61.5, 2);
//        System.out.println(bmi.getCurrentBMI());
//        bmi.calculateBMI(61.5, 2);
//        bmi.showBMILog();
//
//        BMR bmr = new BMR();
//        bmr.calculateBMR(70, 6, 20, "light");
//        bmr.showBMRLog();
//        WaterIntakeTracker intakeTracker = new WaterIntakeTracker();
//        intakeTracker.addIntake(2000);
//        intakeTracker.showIntakeLog();
//
//        intakeTracker.addIntake(2000);
//        intakeTracker.showIntakeLog();
//        HeartRateTracker heartRateTracker = new HeartRateTracker();
//        heartRateTracker.addReading(40);
//        heartRateTracker.showLog();

//        BloodPressureTracker bp = new BloodPressureTracker();
//        bp.addReading(120, 80);
//        bp.showLog();

//        DiseaseTracker diseaseTracker = new DiseaseTracker();
//        diseaseTracker.addDisease("12/01/2021", "Malaria", "Fever, chills, headache");
//        diseaseTracker.showDiseaseHistory();

//        WorkoutTracker workoutTracker = new WorkoutTracker(60);
//        workoutTracker.logWorkout("SWIMMING", 50);
//        workoutTracker.logWorkout("Running", 30);
//        workoutTracker.logWorkout("SWInnING", 30);
//        workoutTracker.showWorkoutLog();

//        MedicineTracker tracker = new MedicineTracker();
//        List<String> days = List.of("Monday", "Tuesday", "Wednesday");
//        tracker.addMedicine("Paracetamol", "500mg", "breakfast", List.of("Monday", "Tuesday", "Wednesday"));
//        tracker.addMedicine("Ibuprofen", "200mg", "lunch", List.of( "Wednesday"));
//        tracker.showDailySchedule("Wednesday");
//        tracker.showWeeklySummary();
////        System.out.println("\n".repeat(50));
//        System.out.println("\t\t------------------------");
//        System.out.println("\t\t         Elixir         ");
//        System.out.println("\t\t  Your Personal Health  ");
//        System.out.println("\t\t        Tracker         ");
//        System.out.println("\t\t------------------------");
//
//        System.out.println("\t\t***********************");
//        System.out.println("\t\t* USER INITIALIZATION *");
//        System.out.println("\t\t***********************");
//        System.out.println();
//        System.out.print("Enter your weight in kg: ");
//        System.out.print("Enter your height in meters: ");
        App app = new App();
        app.initializeUser();
        app.showMainMenu();
    }
}
