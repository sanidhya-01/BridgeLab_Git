// YOU ARE GIVEN AN ARRAY OF N INTEGERS. FIND THE NUMBER OF SUB ARRAYS WHOSE SUM IS EVEN AND STARTS WITH AN ODD NUMBER
import java.util.Scanner;
public class SubArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+" integers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                int sum=0;
                for(int j=i;j<n;j++){
                    sum=sum+arr[j];
                    if(sum%2==0){
                        count++;
                    }
                }

            }
        }
        System.out.println("Number of Valid subarrays: "+count);
    }
}
