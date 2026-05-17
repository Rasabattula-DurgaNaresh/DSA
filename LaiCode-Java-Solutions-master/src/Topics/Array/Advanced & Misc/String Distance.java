public class Solution {
  public int distance(String[] array, String source, String target) {
    // Write your solution here
    List<Integer> listS = getIndexList(array, source);
    List<Integer> listT = getIndexList(array, target);
    
    if (listS.size() == 0 || listT.size() == 0) {
      return -1;
    }
    
    int minDiff = Integer.MAX_VALUE;
    
    for (int n1 : listS) {
      for (int n2 : listT) {
        minDiff = Math.min(minDiff, Math.abs(n2 - n1));
      }
    }
    
    return minDiff;
  }
  
  private List<Integer> getIndexList(String[] arr, String str) {
    List<Integer> list = new ArrayList<>();
    
    for (int i=0; i<arr.length; i++) {
      if (arr[i].equals(str)) {
        list.add(i);
      }
    }
    
    return list;
  }
}

