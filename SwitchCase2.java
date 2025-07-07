import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = sc.nextLine();

        switch (color) {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("READY");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid color! Please enter red, yellow, or green.");
        }

        sc.close();
    }
}
