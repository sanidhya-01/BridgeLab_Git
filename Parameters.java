import java.util.Scanner;
//USING PARAMETERS
public class Parameters {

    // Method with parameters
   public void add(int a, int b) {
        int add = a + b;
        System.out.println("Addition = " + add);
    }
    public void subtract(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction = " + sub);
    }

    public void multiply(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication = " + mul);
    }

    public void division(int a, int b) {
        if (b != 0) {
            int quotient = a / b;
            System.out.println("Division = " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parameters calc = new Parameters();

        System.out.println("Enter A:");
        int a = sc.nextInt();

        System.out.println("Enter B:");
        int b = sc.nextInt();

        calc.add(a, b);
        calc.subtract(a, b);
        calc.multiply(a, b);
        calc.division(a, b);
    }
}



