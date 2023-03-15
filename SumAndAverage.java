package practice;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 5 numbers:");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / 5;

        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The average is: " + average);

        scanner.close();
    }
}