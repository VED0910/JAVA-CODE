package practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        // Find the largest number
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The largest number is: " + max);

        // Check if the numbers are equal or not
        if (num1 == num2 && num2 == num3) {
            System.out.println("The three numbers are equal.");
        } else {
            System.out.println("The three numbers are not equal.");
        }
    }
}