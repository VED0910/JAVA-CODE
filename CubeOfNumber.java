package practice;
import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
        }
    }
}