class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int start = 0;
        int end = nums1Length;
        
        while(start <= end){
            
            int partition1 = start + (end-start)/2; 
            int partition2 = (nums1.length + nums2.length + 1)/2 - partition1; 
            
            
            int left1 = (partition1 > 0)? nums1[partition1 - 1] : Integer.MIN_VALUE;
            int left2 = (partition2 > 0)? nums2[partition2 - 1] : Integer.MIN_VALUE;
            
            int right1 = (partition1 < nums1.length)? nums1[partition1] : Integer.MAX_VALUE;
            int right2 = (partition2 < nums2.length)? nums2[partition2] : Integer.MAX_VALUE;
            
            
            if(left1 <= right2 && left2 <= right1){
                if((nums1Length + nums2Length) % 2 == 0){
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }
                else{
                    return Math.max(left1, left2);
                }
            }
            else if(left1 > right2){    // Base Binary Search Condition
                end = partition1 - 1;
            }
            else{
                start = partition1 + 1; // Base Binary Search Condition
            }
            
        }
        
        return 0.0;
        
    }
}