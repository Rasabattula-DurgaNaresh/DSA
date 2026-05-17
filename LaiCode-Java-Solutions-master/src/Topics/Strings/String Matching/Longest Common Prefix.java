public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Write your solution here

        StringBuilder sb = new StringBuilder();
        int i = 0;
        char c;
        while (true) {
            boolean flag = true;
            c = '*';

            for (String str : strs) {
                if (str.length() <= i) {
                    flag = false;
                    break;
                }

                if (c == '*') {
                    c = str.charAt(i);
                } else if (c != str.charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (!flag || c == '*') {
                break;
            }

            sb.append(c);
            i++;
        }

        return sb.toString();
    }
}

