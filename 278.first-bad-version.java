public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        while(l<=n){
            int m=l+(n-l)/2;
            if(isBadVersion(m)){
                n=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}