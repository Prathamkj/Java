import java.util.*;
// Find the average of the number according to the limits

// Input:

// Enter the Limit:5

// Enter the Array:1,2,3,4,5

// Enter the Limit1:2
// Enter the Limit2:6

// Output:
// 4
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Limit:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the Array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter Limit1:");
        int l1 = sc.nextInt();
        
        System.out.println("Enter Limit2:");
        int l2 = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] >= l1 && arr[i] <= l2){
                sum += arr[i];
                count++;
            }
        }
        
        if(count > 0){
            double avg = (double) sum / count;
            System.out.println(avg);
        }
        else{
            System.out.println("No elements in range");
        }
    }
}