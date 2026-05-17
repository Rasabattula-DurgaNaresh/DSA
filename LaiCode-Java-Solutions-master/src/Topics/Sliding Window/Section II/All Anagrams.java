public class Solution {
    public List<Integer> allAnagrams(String sh, String lo) {
        // Write your solution here
        List<Integer> list = new ArrayList<>();
        if (sh.length() == 0 || lo.length() == 0 || sh.length() > lo.length()) {
            return list;
        }
        
        int[] wordMap = new int[26];
        int[] checkMap = new int[26];

        for (int i=0; i<sh.length(); i++) {
            wordMap[sh.charAt(i) - 'a']++;
        }

        String wordMapStr = Arrays.toString(wordMap);

        for (int i=0; i<sh.length() - 1; i++) {
            checkMap[lo.charAt(i) - 'a']++;
        }

        for (int i=0; i<lo.length() - sh.length() + 1; i++) {
            checkMap[lo.charAt(i + sh.length() - 1) - 'a']++;

            if (wordMapStr.equals(Arrays.toString(checkMap))) {
                list.add(i);
            }

            checkMap[lo.charAt(i) - 'a']--;
        }

        return list;
    }
}

