class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] indexMap = new int[128]; // Saare characters ka track rakhne ke liye
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // Agar character pehle dikh chuka hai aur wo current window ke andar hai
            if (indexMap[ch] > left) {
                left = indexMap[ch]; // Seedhe duplicate ke agle index par jump
            }

            indexMap[ch] = right + 1; // Character ki nayi position save karo
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}