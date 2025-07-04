import java.util.Scanner;

public class Calculator2 {
    int x, y;

    // Method to perform calculations
    public void calculator(int x, int y) {
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));

        if (y != 0) {
            System.out.println("Multiplication: " + (x * y));
            System.out.println("Division: " + (x / y));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Calculator2 obj = new Calculator2();
        obj.calculator(x, y);
    }
}
