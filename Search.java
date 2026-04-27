import java.util.*;

/* 
    Searching Algorithms are the  one which is used to search things
*/

class Search{
    
    // Simple Search : O(n) 
  public static int simpleSearch(int arr[],int target){
    for(int i = 0;i<arr.length;i++){
      if(arr[i] == target){
        return i;
      }
    }
    return -1;
  }
  
  // Binary Search : Sorted order : O(log(n))
  public static int binarySearch(int[] arr,int target){
    int left = 0;
    int right = arr.length - 1;
    while(left<=right){
      int mid = (left+right)/2;
      if(arr[mid] == target){
        return mid;
      }
      else if(arr[mid] > target){
        right = mid - 1;
      }
      else{
        left = mid + 1;
      }
    }
    return -1;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    
    int ans = simpleSearch(arr,target);
    System.out.println(ans);
    // sorted order 
    int sol = binarySearch(arr,target);
    System.out.println(sol);
    
  }
}
