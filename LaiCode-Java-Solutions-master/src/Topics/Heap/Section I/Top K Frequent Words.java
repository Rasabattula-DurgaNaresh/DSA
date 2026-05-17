public class Solution {
    public String[] topKFrequent(String[] combo, int k) {
        // Write your solution here
        Map<String, Integer> map = new HashMap<>();
        for (String word : combo) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(map.get(o2)).compareTo(Integer.valueOf(map.get(o1)));
            }
        });

        for (String key : map.keySet()) {
            pq.add(key);
        }

        int len = map.size() > k ? k : map.size();
        String[] ans = new String[len];

        for (int i=0; i<len; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}

