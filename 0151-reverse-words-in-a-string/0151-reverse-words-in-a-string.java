class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        reverse(arr, 0, n - 1);
        
        int start = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i == n || arr[i] == ' ') {
                if (start != i) {
                    reverse(arr, start, i - 1);
                    if (result.length() > 0) result.append(" ");
                    result.append(arr, start, i - start);
                }
                start = i + 1;
            }
        }
        
        return result.toString();
    }
    
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}