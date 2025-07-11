LOOP-A loop is a control structure that allows you to repeat a block of code multiple times, automatically, based on a condition.
TYPES OF LOOPS
1. Entry-Controlled Loop
➡️ The condition is checked first, then the loop body is executed.

        ✅ Characteristics:
If the condition is false at the start, the loop body does not run at all.

Also called pre-test loops.

        ✅ Examples:
        for loop

while loop
EXAMPLE
int i = 1;
while (i <= 5) {   // condition checked first
        System.out.println(i);
i++;
        }


        2. Exit-Controlled Loop
➡️ The loop body is executed first, then the condition is checked.

        ✅ Characteristics:
Loop body executes at least once (even if the condition is false).

Also called post-test loops.

        ✅ Example:
        do-while loop:
int i = 1;
do {
        System.out.println(i);
i++;
        } while (i <= 5);  // condition checked after body
}


YOU ARE GIVEN A BINARY ARRAY (I.E, AN ARRAY CONTAINING ONLY 0S AND 1S).
 YOU CAN FLIP AT MOST ONE 0 TO 1. YOUR TASK IS TO FIND THE LENGTH OF THE LONGEST SUBARRAY CONSISTING ONLY OF 1S AFTER FLIPPING AT MOST ONE 0.



public class LOOPS {

        public static int longestSubarray(int[] nums) {
            int left = 0;
            int zeros = 0;
            int maxLen = 0;

            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zeros++;
                }

                while (zeros > 1) {
                    if (nums[left] == 0) {
                        zeros--;
                    }
                    left++;
                }

                maxLen = Math.max(maxLen, right - left);
            }

            return maxLen;
        }

        public static void main(String[] args) {
            int[] arr = {1, 0, 1, 1, 0};
            System.out.println(longestSubarray(arr));  // Output: 4
        }
    }



YOU ARE GIVEN AN ARRAY WHERE EVERY ELEMENT APPEARS TWICE, EXCEPT ONE ELEMENT APPEARS TWICE,EXCEPT ONE ELEMENT WHICH APPEARS ONLY ONCE
YOUR TASK IS TO FIND AND PRINT THATA UNIQUE ELEMENT..

import java.util.Scanner;
public class LOOPS{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
    }
}

            if(count == 1) {
                System.out.println("Unique element is: " + arr[i]);
                break;
            }
        }
    }
}
