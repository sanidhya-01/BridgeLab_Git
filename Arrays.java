STRING AND CHARACTER INDEX
 String is NOT a primitive type in Java
 It is a class in java.lang package

String str = "hello";

 You can also treat it like a character array:
char[] ch = str.toCharArray();
System.out.println(ch[0]);  // prints 'h'


ARRAY DECLARATION STYLES
int[] arr1 = {10, 20, 30};   // Preferred in Java
int arr2[] = {10, 20, 30};   // Also valid (C-style)

MEMORY STORAGE HEAP AND STACK
int[] arr = new int[5];
Stack         →       Heap
arr --------> [0][0][0][0][0]


CONTIGOUS MEMORY
Arrays in Java (like in C/C++) store elements in contiguous memory locations in the heap.
This means each element is placed right next to the previous one in memory.

INDEX NUMBER IN ARRAY
int[] arr = {10, 20, 30};

Memory:

Stack               Heap
------             --------------
arr   ----------> [10][20][30]

TAKE A SIMPLE ARRAY AND PRINT
public class Arrays{
    public static void main(String[]args){
        int [] arr={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

//ARRAY USING SCANNER CLASS
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask for size of array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // Step 2: Declare and create array
        int[] arr = new int[size];

        // Step 3: Take input from user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Step 4: Print array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        sc.close();
    }
}
