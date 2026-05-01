import java.util.Scanner;

public class Recursion {
    
    // Implement the sum of numbers in array using recursion
    public static int sumOfNumbers(int ind ,int[]arr){
         if(ind == arr.length){
             return 0;
         }
         return arr[ind] + sumOfNumbers(ind+1,arr);
    }

    // Implement the binary search using recursion
    public static int binarySearch(int low,int high,int[]arr,int target){
         if(low > high){
             return -1;
         }
         int mid = (low+high)/2;

         if(arr[mid] == target){
              return mid;
         }
         if(arr[mid] < target){
             return binarySearch(mid+1, high, arr, target);
         }
         else{
             return binarySearch(low, mid-1, arr, target);
         }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sum = sumOfNumbers(0,arr);
        System.out.println(sum);

        int target = sc.nextInt();
        int found = binarySearch(0, arr.length-1, arr, target);
        System.out.println(found);

        sc.close();

    }
}
