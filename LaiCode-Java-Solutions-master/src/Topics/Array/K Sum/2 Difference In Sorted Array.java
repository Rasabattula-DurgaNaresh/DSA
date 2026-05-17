public class Solution {
  public int[] twoDiff(int[] array, int target) {
    // Write your solution here
    int[] ans;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i=0; i<array.length; i++) {
      if (map.containsKey(array[i] - target)) {
        ans = new int[2];
        ans[0] = map.get(array[i] - target);
        ans[1] = i;
        return ans;
      }
      
      if (map.containsKey(array[i] + target)) {
        ans = new int[2];
        ans[1] = map.get(array[i] + target);
        ans[0] = i;
        return ans;
      }
      
      map.put(array[i], i);
    }
    
    ans = new int[0];
    
    return ans;
  }
}

