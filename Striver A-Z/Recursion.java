public class REcursion {
  static public void printNos(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }

    printNos(n - 1);
    System.out.print(n + " ");
  }

  static public int sumOfSeries(int num) {
    if (num <= 1) {
      return num;
    }

    return num + sumOfSeries(num - 1);
  }

  static public int factorial(int num) {
    if (num <= 1) {
      return 1;
    }

    return num * factorial(num - 1);
  }

  static public int[] reverseArr(int[] arr) {
    return reverseArr(arr, 0);
  }

  static public int[] reverseArr(int[] arr, int l) {
    int r = arr.length - l - 1;
    if (l >= r) {
      return arr;
    }
    arr[l] = arr[l] + arr[r] - (arr[r--] = arr[l++]);
    return reverseArr(arr, l);
  }

  static public boolean checkPallindrome(String str) {
    char[] strC = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
    if (strC.length <= 1)
      return true;
    return checkPallindrome(strC, 0);
  }

  private static boolean checkPallindrome(char[] arr, int l) {
    int r = arr.length - l - 1;
    if (l >= r) {
      return arr[l] == arr[r] ? true : false;
    }

    if (arr[l] != arr[r]) {
      return false;
    }

    return checkPallindrome(arr, ++l);
  }

  static int fibonacciNo(int num){
    if (num <= 1){
      return num;
    }
    return fibonacciNo(num-1) + fibonacciNo(num-2);
  }
  public static void main(String[] args) {
    
  }
}
