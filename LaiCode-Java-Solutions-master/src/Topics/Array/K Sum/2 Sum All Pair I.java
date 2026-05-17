public class Solution {
  public List<List<Integer>> allPairs(int[] array, int target) {
    // Write your solution here
    List<List<Integer>> ans = new ArrayList<>();
    Map<Integer, List<Integer>> map = new HashMap<>();
    
    for (int i=0; i<array.length; i++) {
      if (map.containsKey(target - array[i])) {
        List<Integer> list = map.get(target - array[i]);
        for (int idx : list) {
          List<Integer> res = Arrays.asList(idx, i);
          ans.add(res);
        }
      }
      
      if (map.containsKey(array[i])) {
        map.get(array[i]).add(i);
      }
      else {
        List<Integer> indexes = new ArrayList<>();
        indexes.add(i);
        map.put(array[i], indexes);
      }
    }
    
    return ans;
  }
}

