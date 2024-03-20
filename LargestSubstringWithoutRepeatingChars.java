import java.util.HashMap;

public class LargestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int i = 0, j = 0;
        while (j < c.length) {
            map.put(c[j], map.getOrDefault(c[j], 0) + 1);

            if (map.size() > j-i+1) {
                j++;
            } else if (map.size() == j-i+1) {
                if (j - i + 1 > max) {
                    max = j - i + 1;
                }
                j++;
            } else {
                while (map.size() < j-i+1) {
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
