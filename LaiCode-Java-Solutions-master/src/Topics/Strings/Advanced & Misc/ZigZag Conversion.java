public class Solution {
    public String convert(String input, int nRows) {
        // Write your solution here
        List<List <Character>> lists = new ArrayList <>();
        for (int i = 0; i < nRows; i++) {
            lists.add(new ArrayList<>());
        }

        int idx = 0;
        int length = input.length();
        int listIdx = 0;
        while (idx < length) {
            lists.get(listIdx++).add(input.charAt(idx++));
            if (listIdx == nRows) {
                for (int i = nRows - 2; i > 0; i--) {
                    if (idx == length) {
                        break;
                    }
                    lists.get(i).add(input.charAt(idx++));
                }
                listIdx = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (List<Character> list : lists) {
            for (Character c : list) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

