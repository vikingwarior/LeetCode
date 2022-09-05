import java.util.HashSet;
import java.util.Set;

class Solution {

    
  
  static void printMaxSubSquare(int M[][], int n , int ) 
  {
    int S[][] = new int[2][C], Max = 0;
  
    // set all elements of S to 0 first
    for (int i = 0; i < 2;i++){
      for (int j = 0; j < C;j++){
        S[i][j] =0;
      }
    }
  
    // Construct the entries
    for (int i = 0; i < R; i++){
      for (int j = 0; j < C; j++){
  
        // Compute the entrie at the current position
        int Entrie = M[i][j];
        if(Entrie != 0){
          if(j != 0){
            Entrie = 1 + Math.min(S[1][j - 1], Math.min(S[0][j - 1], S[1][j]));}}
  
        // Save the last entrie and add the new one
        S[0][j] = S[1][j];
        S[1][j] = Entrie;
  
        // Keep track of the max square length
        Max = Math.max(Max, Entrie);
      }
    }
  
    // Print the square
    System.out.print("Maximum size sub-matrix is: \n");
    for (int i = 0; i < Max; i++){
      for (int j = 0; j < Max;j++){
        System.out.print( "1 ");}
      System.out.println();
    }
  } 

    

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("1234qwe56")); // output: PAHNAPLSIIGYIR
    }
}

/*

babad
^
|
left
^
|
right
  
  12 3 45
*/