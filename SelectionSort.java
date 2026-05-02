import java.util.Scanner;

public class SelectionSort {
    public static void selectSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
             int min = i;
             for(int j=i+1;j<n;j++){
                 if(arr[min] > arr[j]){
                     min = j;
                 }
             }
             int t = arr[min];
             arr[min] = arr[i];
             arr[i] = t;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        selectSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
