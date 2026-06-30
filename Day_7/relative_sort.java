import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Since 0 <= arr1[i] <= 1000, we can use a frequency array
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }
        
        int[] result = new int[arr1.length];
        int index = 0;
        
        // First, add elements of arr2 to result in the specified relative order
        for (int num : arr2) {
            while (count[num] > 0) {
                result[index++] = num;
                count[num]--;
            }
        }
        
        // Then, add remaining elements (not in arr2) in ascending order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[index++] = i;
                count[i]--;
            }
        }
        
        return result;
    }
}