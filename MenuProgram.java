package practice;
import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Menu:");
        System.out.println("1. Accept number and find out square.");
        System.out.println("2. Accept number and find out cube.");
        System.out.println("3. Check whether the given year is LEAP or not.");
        System.out.print("Enter your choice (1, 2 or 3): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num1 = sc.nextInt();
                int square = num1 * num1;
                System.out.println("Square of " + num1 + " is " + square);
                break;
            case 2:
                System.out.print("Enter a number: ");
                int num2 = sc.nextInt();
                int cube = num2 * num2 * num2;
                System.out.println("Cube of " + num2 + " is " + cube);
                break;
            case 3:
                System.out.print("Enter a year: ");
                int year = sc.nextInt();
                boolean isLeap = false;
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            isLeap = true;
                        }
                    } else {
                        isLeap = true;
                    }
                }
                if (isLeap) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}