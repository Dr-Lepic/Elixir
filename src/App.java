import java.util.*;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private User user = User.getInstance();
    private BMI bmi = new BMI();
    private BMR bmr = new BMR();
    private WaterIntakeTracker waterTracker = new WaterIntakeTracker();
    private WorkoutTracker workoutTracker;
    private HeartRateTracker heartRateTracker = new HeartRateTracker();
    private BloodPressureTracker bpTracker = new BloodPressureTracker();
    private MedicineTracker medTracker = new MedicineTracker();
    private DiseaseTracker diseaseTracker = new DiseaseTracker();

    private void clearConsole() {
        System.out.print("\n".repeat(20));
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
    }

    private void waitForUser() {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

//    public static void main(String[] args) {
//        App app = new App();
//        app.initializeUser();
//        app.showMainMenu();
//    }

    public void initializeUser() {
        System.out.println("\t\t------------------------");
        System.out.println("\t\t  USER INITIALIZATION   ");
        System.out.println("\t\t------------------------");
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        user.initializeUserDetails(weight, height, age);
        workoutTracker = new WorkoutTracker(user.getWeight());
    }

    public void showMainMenu() {
        while (true) {
            clearConsole();
            System.out.println("\t\t------------------------");
            System.out.println("\t\t         Elixir         ");
            System.out.println("\t\t  Your Personal Health  ");
            System.out.println("\t\t        Tracker         ");
            System.out.println("\t\t------------------------\n");
            System.out.println("1. User Profile Management");
            System.out.println("2. BMI/BMR Calculator");
            System.out.println("3. Water Intake Tracker");
            System.out.println("4. Workout Tracker");
            System.out.println("5. Heart Rate Tracker");
            System.out.println("6. Blood Pressure Tracker");
            System.out.println("7. Medicine Tracker");
            System.out.println("8. Disease Tracker");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: handleUserProfileMenu(); break;
                case 2: handleBMIBMRMenu(); break;
                case 9: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }


    private void handleUserProfileMenu() {
        while (true) {
            clearConsole();
            user.displayUserDetails();
            System.out.println("\t\t------------------------");
            System.out.println("\t\t    USER PROFILE MENU   ");
            System.out.println("\t\t------------------------");
            System.out.println();
            System.out.println("1. Update Weight");
            System.out.println("2. Update Height");
            System.out.println("3. Update Age");
            System.out.println("4. Return to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter new weight (kg): ");
                    double newWeight = scanner.nextDouble();
                    scanner.nextLine();
                    user.updateWeight(newWeight);
                    break;
                case 2:
                    System.out.print("Enter new height (m): ");
                    double newHeight = scanner.nextDouble();
                    scanner.nextLine();
                    user.updateHeight(newHeight);
                    break;
                case 3:
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    user.updateAge(newAge);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
            waitForUser();
        }

    }

    private void handleBMIBMRMenu() {
        while (true) {
            clearConsole();
            System.out.println("\t\t------------------------");
            System.out.println("\t\t      BMI/BMR MENU ");
            System.out.println("\t\t------------------------\n");
            System.out.println("1. Calculate BMI");
            System.out.println("2. Show BMI Log");
            System.out.println("3. Calculate BMR");
            System.out.println("4. Show BMR Log");
            System.out.println("5. Return to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (bmi.calculateBMI(user.getWeight(), user.getHeight())){
                        System.out.println("\nBMI calculated successfully!");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.print("----".repeat(12));
                    System.out.println();
                    bmi.showBMILog();
                    System.out.print("----".repeat(12));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter activity level (sedentary/light/moderate/active/very active): ");
                    String activity = scanner.nextLine();
                    if( bmr.calculateBMR(user.getWeight(), user.getHeight()*100, user.getAge(), activity)){
                        System.out.println("\nBMR calculated successfully!");
                    }
                    break;
                case 4:
                    System.out.print("----".repeat(11));
                    System.out.println();
                    bmr.showBMRLog();
                    System.out.print("----".repeat(11));
                    System.out.println();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
            waitForUser();
        }

    }

}
