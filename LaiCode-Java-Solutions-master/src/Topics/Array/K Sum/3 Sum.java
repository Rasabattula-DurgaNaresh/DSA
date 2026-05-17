public class Solution {
  public List<List<Integer>> allTriples(int[] array, int t) {
    // Write your solution here
    List<List<Integer>> ans = new ArrayList<>();
    Set<String> set = new HashSet<>();
    Arrays.sort(array);
    for (int i=0; i<array.length; i++) {
      int target = t - array[i];
      int start = i + 1;
      int end = array.length - 1;
      
      while (start < end) {
        if (array[start] + array[end] == target) {
          String key = new StringBuilder()
                            .append(array[i])
                            .append("-")
                            .append(array[start])
                            .append("-")
                            .append(array[end])
                            .toString();
          if (!set.contains(key)) {
            List<Integer> list = Arrays.asList(array[i], array[start], array[end]);
            ans.add(list);
            set.add(key);
          }
          
          start++;
          end--;
        }
        else if (array[start] + array[end] < target) {
          start++;
        }
        else {
          end--;
        }
      }
    }
    
    return ans;
  }
}

