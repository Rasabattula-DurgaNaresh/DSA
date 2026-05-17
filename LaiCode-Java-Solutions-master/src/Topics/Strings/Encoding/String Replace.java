public class Solution {
    public String replace(String input, String source, String target) {
        List<Character> patternList = new ArrayList<>();
        for (char c : target.toCharArray()) {
            patternList.add(c);
        }

        List<Character> chars = new ArrayList<>();
        int idx = 0;
        int n = input.length();
        int sourceLen = source.length();

        while (idx < n) {
            if (idx + sourceLen <= n && input.substring(idx, idx + sourceLen).equals(source)) {
                chars.addAll(patternList);
                idx += sourceLen;
            }
            else {
                chars.add(input.charAt(idx));
                idx++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}

