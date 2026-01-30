import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter number of times to flip the coin: ");
        int flips = scanner.nextInt();
        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < flips; i++) {
            double value = random.nextDouble();
            if (value < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        double headsPercentage = (heads * 100.0) / flips;
        double tailsPercentage = (tails * 100.0) / flips;
        System.out.println("Heads count: " + heads);
        System.out.println("Tails count: " + tails);
        System.out.println("Heads Percentage: " + headsPercentage + "%");
        System.out.println("Tails Percentage: " + tailsPercentage + "%");
    }
}
