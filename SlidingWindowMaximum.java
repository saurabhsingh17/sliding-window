import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    /*
    https://leetcode.com/problems/sliding-window-maximum/description/
     */

    //key thing to note here is we are removing element from last till we get element greater than current

    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0, j = 0;
        int n = nums.length;
        int index = 0;
        int[] ans = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        while(j < n){
            while(!deque.isEmpty() && nums[j] > deque.peekLast()){
                deque.pollLast();
            }
            deque.add(nums[j]);
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                ans[index] = deque.peekFirst();
                index++;
                if(deque.peekFirst() == nums[i]){
                    deque.pollFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
