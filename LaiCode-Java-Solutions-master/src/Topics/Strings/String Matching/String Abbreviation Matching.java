public class Solution {
    public boolean match(String input, String pattern) {
        // Write your solution here
        int i = 0;
        int j = 0;

        while (i < pattern.length()) {
            if (Character.isDigit(pattern.charAt(i))) {
                StringBuilder num = new StringBuilder();
                while (i < pattern.length() && Character.isDigit(pattern.charAt(i))) {
                    num.append(pattern.charAt(i));
                    i++;
                }

                j += Integer.parseInt(num.toString());

                if (j > input.length()) {
                    return false;
                }
            }
            else {
                if (pattern.charAt(i) != input.charAt(j)) {
                    return false;
                }

                i++;
                j++;
            }
        }

        return i == pattern.length() && j == input.length();
    }
}

