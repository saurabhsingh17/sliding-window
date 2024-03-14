import java.util.ArrayList;

public class MaximumSumSubarrayOfSizeK {
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int N){
        // code here
        int i = 0, j = 0;
        long sum = 0, max = 0;
        while (j < Arr.size()) {
            sum += Arr.get(j);

            if(j-i+1 < k) {
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(max,sum);
                sum -= Arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
}
