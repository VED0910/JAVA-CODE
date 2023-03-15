package practice;
import java.util.Scanner;

public class DiscounSt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Are you a student? (Enter Y for Yes and N for No): ");
        char isStudent = sc.next().charAt(0);
        double discount;
        if(isStudent == 'Y' || isStudent == 'y') {
            if(costPrice > 500) {
                discount = costPrice * 0.1;
            } else {
                discount = costPrice * 0.05;
            }
        } else {
            if(costPrice > 500) {
                discount = costPrice * 0.08;
            } else {
                discount = costPrice * 0.02;
            }
        }
        double finalPrice = costPrice - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        sc.close();
    }
}