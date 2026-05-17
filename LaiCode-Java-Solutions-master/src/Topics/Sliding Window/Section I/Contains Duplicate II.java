public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Write your solution here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            
            map.put(nums[i], i);
        }
        
        return false;
    }
}

