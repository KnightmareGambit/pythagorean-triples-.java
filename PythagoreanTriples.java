package Question07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 ≤ n ≤ 90,000): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 90000) {
            System.out.println("Invalid input. Please enter a number between 1 and 90,000.");
            return;
        }

        int[] triplets = findPythagoreanTriplets(n);

        if (triplets == null) {
            System.out.println("Impossible");
        } else {
            System.out.println("Pythagorean triplets:");
            for (int triplet : triplets) {
                System.out.print(triplet + " ");
            }
        }

        scanner.close();
    }

    public static int[] findPythagoreanTriplets(int n) {
        for (int a = 1; a <= n / 3; a++) {
            for (int b = a + 1; b <= (n - a) / 2; b++) {
                int c = n - a - b;
                if (a * a + b * b == c * c) {
                    return new int[]{a, b, c};
                }
            }
        }
        return null;
    }
}

