public class Solution {
    public int[] dedup(int[] array) {
        // Write your solution here
        if (array.length == 1) {
            return array;
        }

        int idx = 0;
        int slow = 0;
        int n = array.length;

        while (idx < n - 1) {
            if (array[idx] == array[idx + 1]) {
                int num = array[idx];
                while (idx < (n - 1) && array[idx] == num) {
                    idx++;
                }
            }
            else {
                array[slow] = array[idx];
                slow++;
                idx++;
            }
        }

        if (array[n-1] != array[n-2]) {
            array[slow] = array[n-1];
            slow++;
        }

        int[] ans = new int[slow];
        for (int i=0; i<slow; i++) {
            ans[i] = array[i];
        }

        return ans;
    }
}

