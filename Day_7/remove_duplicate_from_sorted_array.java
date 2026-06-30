class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // 'i' keeps track of the position of the last unique element found
        int i = 0;
        
        // 'j' scans through the array to find new unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // Move to the next position
                nums[i] = nums[j]; // Update with the new unique element
            }
        }
        
        // The number of unique elements is i + 1
        return i + 1;
    }
}