public class Solution {
  public int threeSumSmaller(int[] num, int target) {
    // Write your solution here
    int n = num.length;
    int count = 0;
    
    for (int i=0; i<n; i++) {
       for (int j=i+1; j<n; j++) {
         for (int k=j+1; k<n; k++) {
           if (num[i] + num[j] + num[k] < target) {
             count++;
           }
         }
       }
    }
    
    return count;
  }
}

