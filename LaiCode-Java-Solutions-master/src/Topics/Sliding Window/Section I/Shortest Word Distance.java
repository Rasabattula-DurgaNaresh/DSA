public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        // Write your solution here
        int minDist1 = -1;
        int minDist2 = -1;
        int minimumWordDistance = Integer.MAX_VALUE;

        for (int i=0; i<words.length; i++) {
            if (words[i].equals(word1)) {
                minDist1 = i;
            }

            if (words[i].equals(word2)) {
                minDist2 = i;
            }

            if (minDist1 != -1 && minDist2 != -1) {
                minimumWordDistance = Math.min(minimumWordDistance, Math.abs(minDist1 - minDist2));
            }
        }

        return minimumWordDistance;
    }
}

