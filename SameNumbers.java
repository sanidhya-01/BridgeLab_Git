import java.util.Scanner;

public class SameNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Please enter a number.");
            return;
        }

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        if (a == b && b == c) {
            System.out.println("All three digits are equal.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Two digits are equal.");
        } else {
            System.out.println("All digits are different.");
        }
    }
}
