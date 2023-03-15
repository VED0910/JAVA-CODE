package practice;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;
        System.out.println("The odd numbers are:");
        for (int i = 1; i <= 2 * n; i += 2) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("The sum of odd natural numbers up to " + n + " terms is: " + sum);

        scanner.close();
    }
}