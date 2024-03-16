import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class FirstNegativeNumInEveryWindowSizeK {
    //https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
    public static void main(String[] args) {
        long[] nums = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(Arrays.toString(printFirstNegativeInteger(nums, nums.length, k)));
    }

    static long[] printFirstNegativeInteger(long nums[], int N, int k) {
        int i = 0, j = 0;
        Deque<Long> list = new ArrayDeque<>();
        ArrayList<Long> res = new ArrayList<>();
        while (j < nums.length) {
            if (nums[j] < 0) {
                list.add(nums[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (list.isEmpty()) {
                    res.add(0L);
                } else {
                    res.add(list.getFirst());
                    if (nums[i] == list.getFirst()) {
                        list.removeFirst();
                    }
                }
                i++;
                j++;

            }
        }
        int n = res.size();
        long[] finalAns = new long[n];
        int index = 0;
        for (long l : res) {
            finalAns[index++] = l;
        }
        return finalAns;
    }
}
