class Solution {
    public String longestPalindrome(String s) {
        String result = "";   
        int maxLength = 0;

        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                
                String substring = s.substring(start, end + 1);
                
                if (isPalindrome(substring)) {
                    
                    if (substring.length() > maxLength) {
                        maxLength = substring.length();
                        result = substring;
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;   
            }
            left++;
            right--;
        }

        return true;   // poora loop chal gaya bina mismatch ke, matlab palindrome hai
    }
}