class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length, mid = nums.length/2, low = 0;
        
        while(low != mid && high != mid){
            
            if(target > nums[mid]){
                low = mid;
                mid = (low+high)/2;
            }
            
            else if(target < nums[mid]){
                high = mid;
                mid = (low+high)/2;
            }
            
            else{
                return mid;
            }
        }
        if(nums[mid] == target) return mid;
        return -1;
    }
}