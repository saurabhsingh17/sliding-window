# Sliding-Window

## Identification
String/Array + SubArray/Substring + K window size/SumSize

## Format
1. Calculation
2. ans
3. Slide the window
    a. remove calculation
    b. i++ j++


### General Code for Fixed Window Size
```java
public class MaximumSumSubarrayOfSizeK {
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int N){
        
        int i = 0, j = 0;
        long sum = 0, max = 0;
        while (j < Arr.size()) {
            calculation

            if(j-i+1 < k) {
                j++;
            }
            else if(j-i+1 == k){
                ///ans
                //sliding the window
                i++;
                j++;
            }
        }
        return max;
    }
}
```
### General format for Variable Size Window
```java
public class VariableSizeSlidingWindow {
    static long slidingWindow() {
        while(j<size()){
            //calculations
            if (condition < k){
                j++;
            } else if (condition == k) {
                //ans calculation
                j++;
            } else if (condition > k) {
                while(condition > k){
                    //remove calculation for i
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
```