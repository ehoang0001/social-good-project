import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserStory {
    private String[] platforms; // Array to store advertising platforms
    private int[] conversionRates; // Array to store conversion rates

    // No-argument constructor
    public UserStory() {
        this.platforms = new String[0];
        this.conversionRates = new int[0];
    }

    // Parameterized constructor
    public UserStory(String[] platforms, int[] conversionRates) {
        this.platforms = platforms;
        this.conversionRates = conversionRates;
    }

    // Method to analyze the best platform based on conversion rates
    public String bestPlatform() {
        if (conversionRates.length == 0) {
            return "No data available.";
        }
        int maxIndex = 0;
        for (int i = 1; i < conversionRates.length; i++) {
            if (conversionRates[i] > conversionRates[maxIndex]) {
                maxIndex = i;
            }
        }
        return platforms[maxIndex] + " has the best conversion rate of " + conversionRates[maxIndex] + "%.";
    }

    // toString method to return general information about the data
    @Override
    public String toString() {
        return "UserStory{" +
                "numberOfPlatforms=" + platforms.length +
                ", numberOfConversionRates=" + conversionRates.length +
                '}';
    }

    // Method to read data from a file and return a String array
    public static String[] toStringArray(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.lines().toArray(String[]::new);
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    // Method to read data from a file and return an int array
    public static int[] toIntArray(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.lines().mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        String platformsFile = "platforms.txt"; // Adjust path as necessary
        String conversionRatesFile = "conversion_rates.txt"; // Adjust path as necessary

        String[] platforms = toStringArray(platformsFile);
        int[] conversionRates = toIntArray(conversionRatesFile);

        UserStory userStory = new UserStory(platforms, conversionRates);
        System.out.println(userStory);
        System.out.println(userStory.bestPlatform());
    }
}
