public class Solution {
  public String addBinary(String a, String b) {
    // Write your solution here
    int i = a.length() - 1;
    int j = b.length() - 1;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    
    while (i >=0 || j >= 0) {
      int temp = -1;
      if (i >= 0 && j >= 0) {
        temp = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + carry;
        i--;
        j--;
      }
      else if (i >=0 && j < 0) {
        temp = Character.getNumericValue(a.charAt(i)) + carry;
        i--;
      }
      else if (i < 0 && j >= 0) {
        temp = Character.getNumericValue(b.charAt(j)) + carry;
        j--;
      }
      
      if (temp == 2) {
        sb.append(0);
        carry = 1;
      }
      else if (temp == 3) {
        sb.append(1);
        carry = 1;
      }
      else {
        sb.append(temp);
        carry = 0;
      }
    }
    
    if (carry == 1) {
      sb.append(1);
    }
    
    return sb.reverse().toString();
  }
}

