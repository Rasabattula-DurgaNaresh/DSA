public class Solution {
  public List<Integer> majority(int[] array, int k) {
    // Write your solution here
    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    
    int limit = array.length / k;
    
    for (int num : array) {
      map.put(num, map.getOrDefault(num, 0) + 1);
      if (map.get(num) > limit) {
        set.add(num);
      }
    }
    
    return new ArrayList<>(set);
  }
}

