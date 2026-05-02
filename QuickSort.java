import java.util.Scanner;

public class QuickSort{
   
    public static int partition(int[]arr,int low,int high){
         int pivot = arr[high];
         int i = low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j] < pivot){
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = t;
        return i+1;
    }
    public static void sort(int[]arr,int low ,int high){
        if(low > high){
             return;
        }
        int pi = partition(arr, low, high);
        sort(arr,low,pi-1);
        sort(arr,pi+1,high);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}