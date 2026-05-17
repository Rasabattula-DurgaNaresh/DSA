public class Solution {
  public boolean oneEditDistance(String source, String target) {
    // Write your solution here
    int i1 = 0;
    
    int n1 = source.length();
    int n2 = target.length();
    
    if (n1 - n2 > 1) {
      return false;
    }
    else if (n1 == n2) {
      if (source.equals(target)) {
        return false;
      }
      
      boolean missed = false;
      while (i1 < n1) {
        if (source.charAt(i1) == target.charAt(i1)) {
          i1++;
          continue;
        }
        
        if (missed) {
          return false;
        }
        
        missed = true;
        i1++;
      }
      
      return true;
    }
    
    return n1 - n2 == 1 ? oneDeleteOnly(source, target, n1, n2) : oneDeleteOnly(target, source, n2, n1);
  }
  
  private boolean oneDeleteOnly(String s, String t, int n1, int n2) {    
    int i = 0;
    int j = 0;
    
     while (i < n1 && j < n2) {
       if (s.charAt(i) != t.charAt(j)) {
         if (i > j) {
           return false;
         }
         i++;
         continue;
       }

       i++;
       j++;
     }
    
    return true;
  }
}

