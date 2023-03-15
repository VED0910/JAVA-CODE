package practice;
public class ArmstrongNumbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int sum = 0;
            int digits = String.valueOf(i).length();
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}