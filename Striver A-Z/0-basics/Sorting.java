import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {

  /* Iterative Sorts */
  private static void selectionSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      int min = i;

      for (int j = i; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      swapNum(arr, i, min);
    }

  }

  private static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swapNum(arr, j, j + 1);
        }
      }
    }

  }

  private static void insertionSort(int[] arr) {
    int n = arr.length;
    int j;
    for (int i = 0; i < arr.length; i++) {
      j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        swapNum(arr, j, --j);
      }
    }
  }

  /* Recursive Sorts */

  /* Merge Sort */
  private static void mergeSort(int[] arr) { // Divide and Merge
    divide(arr, 0, arr.length - 1);
  }

  public static void divide(int[] arr, int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2;
    divide(arr, low, mid);
    divide(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  private static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  /*
   * Quick Sort
   * Reason to use above merge -> Auxilary array isnt required in merge.
   */

  /*
   * Algorithm ->
   * - Pick a pivot
   * - Put the pivot in its correct place
   * - correct place means all nos smaller than no should be on left and all
   * larger nos should be on the right
   * 
   */
  private static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);
      quickSort(arr, low, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivotNo = arr[low];
    int left = low;
    int right = high;


    while (left < right) {
      while (arr[left] <= pivotNo && left <= high-1) {
        left++;
      }
      while (arr[right] > pivotNo && right >= low+1) {
        right--;
      }

      if (left < right) {
        swapNum(arr, left, right);
      }
    }
    
    swapNum(arr, low, right);
    
    return right;
  }

  /* Main Function */
  public static void main(String[] args) {
    // int[] nums = { 24, 13};
    int[] nums = { 24, 18, 38, 43, 14, 40, 1, 54 };
    printArr(nums);
    quickSort(nums);
    printArr(nums);
  }

  /* Helper Methods */
  private static void printArr(int[] nums) {
    for (int i : nums) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  private static void swapNum(int[] arr, int n1, int n2) {
    int temp = arr[n1];
    arr[n1] = arr[n2];
    arr[n2]=temp;
  }

  private static int[] swapNum(int n1, int n2) {
    return new int[] { n2, n1 };
  }
}