public class Solution {
  public int search(int[][] matrix) {
    if (matrix.length <= 1) {
      return -1; 
    }
    
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int[] arr : matrix) {
      Set<Integer> set = new HashSet<>();
      for (int num : arr) {
        set.add(num);
      }
      
      Iterator<Integer> iterator = set.iterator();
      while (iterator.hasNext()) {
        int n = iterator.next();
        map.put(n, map.getOrDefault(n, 0) + 1);
        if (map.get(n) == matrix.length) {
          return n;
        }
      }
    }
    
    return -1;
  }
}

