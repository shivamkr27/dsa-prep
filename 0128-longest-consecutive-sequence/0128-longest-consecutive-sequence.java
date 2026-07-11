class Solution {
    public int longestConsecutive(int[] nums) {
      Arrays.sort(nums);
      int currentcount=0;
      int maxcount=0;
      int n=nums.length;
      if(n==0)return 0;
      for(int i=0;i<n-1;i++){
        if(nums[i]!=nums[i+1]){
            if(nums[i+1]==(nums[i]+1)){
                currentcount++;
            }
        else{
            maxcount=Math.max(maxcount,currentcount+1);
        currentcount=0;
        }}}
        maxcount=Math.max(maxcount,currentcount+1);
        return maxcount;
      }  }
    