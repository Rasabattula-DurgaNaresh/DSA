public class Solution {
    public int[] rainbowSortIII(int[] array, int k) {
        // Write your solution here
        int[] count = new int[k];
        int n = array.length;

        for (int i=0; i<n; i++) {
            count[array[i] - 1]++;
        }

        int idx = 0;
        for (int i=0; i<k; i++) {
            int c = count[i];
            while (c-- > 0) {
                array[idx++] = i+1;
            }
        }

        return array;
    }
}

