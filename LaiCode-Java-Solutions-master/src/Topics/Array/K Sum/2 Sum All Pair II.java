public class Solution {
  public List<List<Integer>> allPairs(int[] array, int target) {
    // Write your solution here
    Set<Integer> set = new HashSet<>();
    int n = array.length;
    List<List<Integer>> ans = new ArrayList<>();
    Set<Integer> map = new HashSet<>();
    
    for (int i=0; i<n; i++) {
      if (set.contains(array[i])) {
        continue;
      }
      
      if (map.contains(target - array[i])) {
        List<Integer> list = Arrays.asList(target - array[i], array[i]);
        ans.add(list);
        set.add(target - array[i]);
        set.add(array[i]);
      }
      
      map.add(array[i]);
    }
    
    return ans;
  }
}

