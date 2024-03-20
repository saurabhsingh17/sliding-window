import java.util.HashMap;

public class LongestSubstringWithKUniqueChars {
    public int longestkSubstr(String s, int k) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (j < c.length) {
            map.put(c[j], map.getOrDefault(c[j], 0) + 1);

            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                if (j - i + 1 > max) {
                    max = j - i + 1;
                }
                j++;
            } else {
                while (map.size() > k) {
                    map.put(c[i], map.get(c[i]) - 1);
                    if (map.get(c[i]) == 0) {
                        map.remove(c[i]);

                    }
                    i++;
                }
                j++;

            }
        }
        return max;

    }
}
