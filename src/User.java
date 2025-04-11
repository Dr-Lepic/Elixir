import java.io.Serializable;

public class User implements Serializable {
    private static User instance;
    private double weight;
    private double height;
    private int age;
    private String  lastWeightUpdate;
    private String  lastHeightUpdate;
    private static final double WEIGHT_THRESHOLD = 5.0;
    private static final double HEIGHT_THRESHOLD = 0.05;

    private User() {

    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public void initializeUserDetails(double weight, double height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.lastWeightUpdate = Utils.formatDate();
        this.lastHeightUpdate = Utils.formatDate();
    }

    public void updateWeight(double newWeight) {
        String  today = Utils.formatDate();

        if (Math.abs(newWeight - weight) > WEIGHT_THRESHOLD && lastWeightUpdate.equals(today)) {
            System.out.printf("Weight change exceeds threshold (%.1f kg). Update not allowed.\n", WEIGHT_THRESHOLD);
            return;
        }

        weight = newWeight;
        lastWeightUpdate = today;
        System.out.println("Weight updated successfully.");
    }

    public void updateHeight(double newHeight) {
        String  today = Utils.formatDate();

        if (Math.abs(newHeight - height) > HEIGHT_THRESHOLD && lastHeightUpdate.equals(today)) {
            System.out.printf("Height change exceeds threshold (%.2f m). Update not allowed.\n", HEIGHT_THRESHOLD);
            return;
        }

        height = newHeight;
        lastHeightUpdate = today;
        System.out.println("Height updated successfully.");
    }

    public void updateAge(int newAge) {
        age = newAge;
        System.out.println("Age updated successfully.");
    }

    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public int getAge() { return age; }
    public String  getLastWeightUpdate() { return lastWeightUpdate; }
    public String  getLastHeightUpdate() { return lastHeightUpdate; }

    public void displayUserDetails() {
        System.out.println("\t\t------------------------");
        System.out.println("\t\t    User Details        ");
        System.out.println("\t\t------------------------");
        System.out.printf("Weight: %.1f kg (last updated: %s)\n", weight, lastWeightUpdate);
        System.out.printf("Height: %.2f m (last updated: %s)\n", height, lastHeightUpdate);
        System.out.printf("Age: %d years\n", age);
    }
}