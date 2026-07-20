class Solution {
    public String longestPalindrome(String s) {
        String result = "";   // ab tak ka best palindrome yaha store hoga
        int maxLength = 0;

        // Kaam 1: Har possible substring banao
        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                
                String substring = s.substring(start, end + 1);
                
                // Kaam 2: Check karo ye substring palindrome hai ya nahi
                if (isPalindrome(substring)) {
                    
                    // Kaam 3: Agar isse bada palindrome mila, to update karo
                    if (substring.length() > maxLength) {
                        maxLength = substring.length();
                        result = substring;
                    }
                }
            }
        }

        return result;
    }

    // Helper function jo check karta hai string palindrome hai ya nahi
    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;   // mismatch mila, palindrome nahi hai
            }
            left++;
            right--;
        }

        return true;   // poora loop chal gaya bina mismatch ke, matlab palindrome hai
    }
}