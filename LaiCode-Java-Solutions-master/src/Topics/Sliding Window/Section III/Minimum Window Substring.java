public class Solution {
    public String minWindow(String source, String target) {
        // Write your solution here
        if (target.equals("")) {
            return "";
        }
      
        int start = 0;
        int end = 0;
        int n = source.length();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : target.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();
        int minlen = Integer.MAX_VALUE;
        int startId = -1;
        int endId = -1;

        while (end < n) {
            if (map.containsKey(source.charAt(end))) {
                map.put(source.charAt(end), map.get(source.charAt(end)) - 1);

                if (map.get(source.charAt(end)) == 0) {
                    count--;
                }
            }

            end++;

            while (count == 0 && start < n) {
                if (end - start < minlen) {
                    minlen = end - start;
                    startId = start;
                    endId = end;
                }

                if (map.containsKey(source.charAt(start))) {
                    map.put(source.charAt(start), map.get(source.charAt(start)) + 1);
                    if (map.get(source.charAt(start)) > 0) {
                        count++;
                    }
                }

                start++;
            }
        }

        return minlen == Integer.MAX_VALUE ? "" : source.substring(startId, endId);
    }
}

