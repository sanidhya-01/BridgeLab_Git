//GIVEN AN ARRAY OF N INTEGERS,FIND THE MAXIMUM SUM OF A SUBARRAY WHERE NO TWO ADJACENT ELEMENTS ARE SELECTED
import java.util.Scanner;

public class SubArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Handle edge cases
        if (n == 0) {
            System.out.println("Maximum sum: 0");
            return;
        }

        if (n == 1) {
            System.out.println("Maximum sum: " + arr[0]);
            return;
        }

        // DP array to store sub-solutions
        int[] sub = new int[n];
        sub[0] = arr[0];
        sub[1] = Math.max(arr[0], arr[1]);

        // Fill DP table
        for (int i = 2; i < n; i++) {
            sub[i] = Math.max(sub[i - 1], arr[i] + sub[i - 2]);
        }

        // Final result
        System.out.println("Maximum sum with no adjacent elements: " + sub[n - 1]);
    }
}
