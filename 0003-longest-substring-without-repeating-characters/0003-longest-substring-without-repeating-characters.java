import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // Agar character pehle se window me hai, to left se hatao
            while (window.contains(ch)) {
                window.remove(s.charAt(left));
                left++;
            }

            // Naya character window me daalo
            window.add(ch);

            // Window ki lambai calculate karo aur max update karo
            int currentWindowSize = right - left + 1;
            maxLen = Math.max(maxLen, currentWindowSize);
        }

        return maxLen;
    }
}