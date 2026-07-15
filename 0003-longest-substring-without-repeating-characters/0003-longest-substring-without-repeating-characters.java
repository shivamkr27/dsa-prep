class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128]; 
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (lastSeen[currentChar] > left) {
                left = lastSeen[currentChar];
            }

            lastSeen[currentChar] = right + 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}