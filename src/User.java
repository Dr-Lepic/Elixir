public class User {
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

    public boolean updateWeight(double newWeight) {
        String  today = Utils.formatDate();

        if (lastWeightUpdate.equals(today)) {
            System.out.println("Can't update weight more than once per day.");
            return false;
        }

        if (Math.abs(newWeight - weight) > WEIGHT_THRESHOLD) {
            System.out.printf("Weight change exceeds threshold (%.1f kg). Update not allowed.\n", WEIGHT_THRESHOLD);
            return false;
        }

        weight = newWeight;
        lastWeightUpdate = today;
        System.out.println("Weight updated successfully.");
        return true;
    }

    public boolean updateHeight(double newHeight) {
        String  today = Utils.formatDate();

        if (lastHeightUpdate.equals(today)) {
            System.out.println("Can't update height more than once per day.");
            return false;
        }

        if (Math.abs(newHeight - height) > HEIGHT_THRESHOLD) {
            System.out.printf("Height change exceeds threshold (%.2f m). Update not allowed.\n", HEIGHT_THRESHOLD);
            return false;
        }

        height = newHeight;
        lastHeightUpdate = today;
        System.out.println("Height updated successfully.");
        return true;
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
        System.out.println("\n=== User Details ===");
        System.out.printf("Weight: %.1f kg (last updated: %s)\n", weight, lastWeightUpdate);
        System.out.printf("Height: %.2f m (last updated: %s)\n", height, lastHeightUpdate);
        System.out.printf("Age: %d years\n", age);
    }
}