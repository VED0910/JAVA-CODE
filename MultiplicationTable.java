package practice;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number (Table to be calculated): ");
        int n = scanner.nextInt();

        System.out.print("Input number of terms: ");
        int terms = scanner.nextInt();

        for (int i = 0; i <= terms; i++) {
            int result = n * i;
            System.out.println(n + " X " + i + " = " + result);
        }

        scanner.close();
    }
}