class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlen=0;
int[] check=new int[128];
Arrays.fill(check,-1);
for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(check[c]>=left){
left=check[c]+1;
    }
check[c]=i;
maxlen=Math.max(maxlen,i-left+1);
}
return maxlen;
    }
}