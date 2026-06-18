class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;

        // Count frequencies and find maximum frequency
        for (int num : nums) {
            freq[num]++;
            maxFreq = Math.max(maxFreq, freq[num]);
        }

        // Sum frequencies of elements having maximum frequency
        int total = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                total += f;
            }
        }

        return total;
    }
}