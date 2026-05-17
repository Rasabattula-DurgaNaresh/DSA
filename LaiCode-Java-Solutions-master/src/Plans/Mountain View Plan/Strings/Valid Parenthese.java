public class Solution {
  public boolean isValid(String input) {
    // Write your solution here
    char[] chars = input.toCharArray();
    Stack<Character> stack = new Stack<>();
    String opening = "({[";
    String ending = ")}]";
    
    for (char c : chars) {
      if (opening.indexOf(c) != -1) {
        stack.push(c);
      }
      else {
        if (stack.isEmpty()) {
          return false;
        }
        
        char open = stack.pop();
        if (opening.indexOf(open) != ending.indexOf(c)) {
          return false;
        }
      }
    }
    
    return stack.isEmpty();
  }
}

