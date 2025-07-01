import java.util.Scanner;
public class Calculator {

int a,b;



    int add,sub,mul,div;
    public void add(){
        int add=a+b;
        System.out.println("Addition= "+add);
    }
    public void subtract(){
        int sub=a-b;
        System.out.println("Subtratcion= "+sub);
    }
    public void multiply(){
        int mul=a*b;
        System.out.println("Multiply="+mul);
    }
        public void division() {
            if (b != 0) {
                int quotient = a / b;
                System.out.println("Division = " + quotient);
            } else {
                System.out.println("Cannot divide by zero.");
            }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter A:");
        calc.a = sc.nextInt();

        System.out.println("Enter B:");
        calc.b = sc.nextInt();


        calc.add();
        calc.subtract();
        calc.multiply();
        calc.division();
    }
}
