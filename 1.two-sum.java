class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> cMap = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            
            if(cMap.get(nums[i]) != null)
            {
             return new int []{i, cMap.get(nums[i])};
            }

            else
             cMap.put(target-nums[i], i);
        }

        return nums;
    }
}