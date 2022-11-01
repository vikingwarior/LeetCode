/*
 * @lc app=leetcode id=1706 lang=java
 *
 * [1706] Where Will the Ball Fall
 */

// @lc code=start
class Solution {
    public int[] findBall(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int arr[]=new int[m];
        Arrays.fill(arr,-1);
        for(int i=0;i<m;i++){
            int x,y;
            x=0;y=i;
            while(true){
                if(x>=n){
                    if(y>=0 && y<m){
                        arr[i]=y;
                    }else{
                        
                    }
                    break;
                }
                else{
                    if(y+1<m && a[x][y]==1 && a[x][y+1]==1){
                        x++;
                        y++;
                    }else if(y-1>=0 && a[x][y]==-1 && a[x][y-1]==-1){
                        x++;
                        y--;
                    }else{
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
// @lc code=end

/*
 * [[1,1,1,-1,-1],
 *  [1,1,1,-1,-1],
 *  [-1,-1,-1,1,1],
 *  [1,1,1,1,-1],
 *  [-1,-1,-1,-1,-1]]
 */