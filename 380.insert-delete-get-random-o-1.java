/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

// @lc code=start
class RandomizedSet {

    List<Integer> nums = new ArrayList<>(); 
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
      if(!nums.contains(val)) return nums.add(val);
      return false;
    }
    
    public boolean remove(int val) {
      if(nums.contains(val)) return nums.remove(Integer.valueOf(val));    
      return false;
    }
    
    public int getRandom() {
      return nums.get((int)(Math.random() * nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

