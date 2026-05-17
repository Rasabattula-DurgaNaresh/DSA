public class Solution {
  public int[][] diff(int[] a, int[] b) {
    // Write your solution here
    Map<Integer, Integer> mapA = new HashMap<>();
    Map<Integer, Integer> mapB = new HashMap<>();
    
    for (int num : a) {
      mapA.put(num, mapA.getOrDefault(num, 0) + 1);
    }
    
    for (int num : b) {
      mapB.put(num, mapB.getOrDefault(num, 0) + 1);
    }
    
    List<Integer> listA = new ArrayList<>();
    List<Integer> listB = new ArrayList<>();
    
    for (Map.Entry<Integer, Integer> entry : mapA.entrySet()) {
      int aCount = entry.getValue();
      int bCount = mapB.getOrDefault(entry.getKey(), 0);
      
      if (aCount > bCount) {
        int diff = aCount - bCount;
        while (diff-- > 0) {
          listA.add(entry.getKey());
        }
      }
    }
    
    for (Map.Entry<Integer, Integer> entry : mapB.entrySet()) {
      int bCount = entry.getValue();
      int aCount = mapA.getOrDefault(entry.getKey(), 0);
      
      if (bCount > aCount) {
        int diff = bCount - aCount;
        while (diff-- > 0) {
          listB.add(entry.getKey());
        }
      }
    }
    
    int[] aArr = new int[listA.size()];
    int[] bArr = new int[listB.size()];  
    
    for (int i=0; i<listA.size(); i++) {
      aArr[i] = listA.get(i);
    }
    
    for (int i=0; i<listB.size(); i++) {
      bArr[i] = listB.get(i);
    }
    
    Arrays.sort(aArr);
    Arrays.sort(bArr);
    
    int[][] ans = new int[2][];
    ans[0] = aArr;
    ans[1] = bArr;
    
    return ans;
  }
}

