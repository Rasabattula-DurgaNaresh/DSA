public class Solution {
  public List<Integer> common(List<Integer> A, List<Integer> B) {
    // Write your solution here
    List<Integer> list = new ArrayList<>();
    
    int n1 = A.size();
    int n2 = B.size();
    int i = 0;
    int j = 0;
    
    while (i < n1 && j < n2) {
      if (A.get(i) == B.get(j)) {
        list.add(A.get(i));
        i++;
        j++;
      }
      else if (A.get(i) > B.get(j)) {
        j++;
      }
      else {
        i++;
      }
    }
    
    return list;
  }
}

