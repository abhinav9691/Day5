import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of coin flips
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        Random random = new Random();

        // Simulate coin flips
        for (int i = 0; i < numFlips; i++) {
            // Generate a random number between 0 (inclusive) and 1 (exclusive)
            double result = random.nextDouble();

            // If the result is less than 0.5, consider it as heads; otherwise, tails
            if (result < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Calculate the percentage of heads and tails
        double headsPercentage = (headsCount * 100.0) / numFlips;
        double tailsPercentage = (tailsCount * 100.0) / numFlips;

        // Print the results
        System.out.printf("Heads: %.2f%%\n", headsPercentage);
        System.out.printf("Tails: %.2f%%\n", tailsPercentage);
    }
}