
/**
 * public class Frequency {
 *   public String str;
 *   public int freq;
 *   public Frequency(String str, int freq) {
 *     this.str = str;
 *     this.freq = freq;
 *   }
 * }
 */
public class Solution {
    public List<Frequency> frequency(String input) {
        // Write your solution here.
        Map<String, Integer> map = new HashMap<>();
        int[] count = new int[26];
        count[0] = count[1] = count[2] = count[3] = 1;
        String countStr = Arrays.toString(count);

        int[] check = new int[26];

        for (int i=0; i<3; i++) {
            check[input.charAt(i) - 'A']++;
        }

        for (int i=0; i<input.length()-3; i++) {
            check[input.charAt(i + 3) - 'A']++;

            if (Arrays.toString(check).equals(countStr)) {
                map.put(input.substring(i, i+4), map.getOrDefault(input.substring(i, i+4), 0) + 1);
            }

            check[input.charAt(i) - 'A']--;
        }

        List<Frequency> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(new Frequency(entry.getKey(), entry.getValue()));
        }

        Collections.sort(list, new Comparator<Frequency>() {
            @Override
            public int compare(Frequency o1, Frequency o2) {
                int c = Integer.valueOf(o2.freq).compareTo(Integer.valueOf(o1.freq));
                if (c == 0) {
                    return o1.str.compareTo(o2.str);
                }

                return c;
            }
        });

        return list;
    }
}

