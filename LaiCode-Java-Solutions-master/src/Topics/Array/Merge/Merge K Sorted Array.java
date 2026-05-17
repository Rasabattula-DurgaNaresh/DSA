public class Solution {
    public int[] merge(int[][] arrayOfArrays) {
        // Write your solution here
        Map<int[], Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.valueOf(o1[map.get(o1)]).compareTo(Integer.valueOf(o2[map.get(o2)]));
            }
        });

        int size = 0;
        for (int[] arr : arrayOfArrays) {
            size += arr.length;
            if (arr.length > 0) {
                map.put(arr, 0);
                pq.add(arr);
            }
        }

        int[] ans = new int[size];
        int idx = 0;

        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            ans[idx++] = arr[map.get(arr)];
            if (map.get(arr) < arr.length - 1) {
                map.put(arr, map.get(arr) + 1);
                pq.add(arr);
            }
        }

        return ans;
    }
}

