import java.util.Scanner;

public class ArraysImpl {
  // Inserting elements
  public static int[] insert(int[] arr, int ind, int ele) {
    if (ind < 0 || ind >= arr.length)
      return arr;
    int newArr[] = new int[arr.length + 1];
    for (int i = 0; i < ind; i++) {
      newArr[i] = arr[i];
    }
    newArr[ind] = ele;
    for (int i = ind + 1; i <= arr.length; i++) {
      newArr[i] = arr[i - 1];
    }
    return newArr;
  }

  // Deleting elements
  public static void delete(Integer[] arr, int ind) {
    if (ind < 0 || ind >= arr.length)
      return;
    for (int i = ind + 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = null;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    int ind = 2;
    int ele = 10;
    arr = insert(arr, 2, 10);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
