public class Solution {
    public List<Integer> maxWindows(int[] arr, int w) {
        int n = arr.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        maxLeft[0] = arr[0];
        maxRight[n - 1] = arr[n - 1];

        for (int i=0; i<n; i++) {
            maxLeft[i] = i % w == 0 ? arr[i] : Math.max(maxLeft[i - 1], arr[i]);
        }

        for (int i=n-2; i >= 0; i--) {
            maxRight[i] = i % w == 0 ? arr[i] : Math.max(maxRight[i + 1], arr[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<=n-w; i++) {
            list.add(Math.max(maxRight[i], maxLeft[i+w-1]));
        }

        return list;
    }
}

