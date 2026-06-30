import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0; // Left boundary of the sliding window
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the map and within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                // Move the left boundary to the right of the last occurrence
                left = map.get(currentChar) + 1;
            }
            
            // Update the map with the current character's index
            map.put(currentChar, right);
            
            // Calculate the max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}